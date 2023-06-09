package cn.ve.thirdgateway.controller;

import cn.ve.base.pojo.VeBaseException;
import cn.ve.feign.pojo.CommonResult;
import cn.ve.thirdgateway.api.ThirdgatewayApi;
import cn.ve.thirdgateway.pojo.*;
import cn.ve.thirdgateway.service.BaseSMSEngine;
import cn.ve.thirdgateway.service.WechatService;
import cn.ve.thirdgateway.util.AliUtil;
import cn.ve.thirdgateway.util.WechatUtil;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.text.MessageFormat;
import java.util.HashMap;

/**
 * @author ve
 * @date 2021/8/2
 */
@Slf4j
@RestController
public class FeignController implements ThirdgatewayApi {

    @Value("${ali.app-key}")
    private String aliAppKey;
    @Value("${ali.app-secret}")
    private String aliAppSecret;
    @Value("${wechat.miniprogram.appid}")
    private String wechatMiniprogramAppid;
    @Value("${wechat.miniprogram.secret}")
    private String wechatMiniprogramSecret;
    @Value("${wechat.url.jscode2session}")
    private String jscode2sessionUrl;
    @Resource
    private WechatService wechatService;
    @Resource
    private BaseSMSEngine baseSMSEngine;

    @Override
    public CommonResult<IdCardOcrResp> idCardOcr(@RequestBody AliOCRParam aliOCRParam) {
        if (StringUtils.isBlank(aliOCRParam.getImageBase64())) {
            return CommonResult.fail(400, "ImageBase64不能为空");
        }
        if (StringUtils.isBlank(aliOCRParam.getSide())) {
            return CommonResult.fail(400, "Side不能为空");
        }
        try {
            return CommonResult.success(
                new AliUtil(aliAppKey, aliAppSecret).idCardOcr(aliOCRParam.getImageBase64(), aliOCRParam.getSide()));
        } catch (Exception e) {
            log.error("身份证ocr识别失败: {}", e.getMessage(), e);
            return CommonResult.fail(500, "身份证ocr识别失败");
        }
    }

    @Override
    public CommonResult<BankCardOcrResp> bankCardOcr(@RequestBody AliOCRParam aliOCRParam) {
        if (StringUtils.isBlank(aliOCRParam.getImageBase64())) {
            throw new VeBaseException("400");
        }
        return CommonResult.success(new AliUtil(aliAppKey, aliAppSecret).bankCardOcr(aliOCRParam.getImageBase64()));
    }

    @Override
    public CommonResult<BankCard3FactorResp> bankCard3Factor(@RequestBody Ali3FactorParam param) {
        try {
            return CommonResult.success(new AliUtil(aliAppKey, aliAppSecret)
                .bankCard3FactorAuth(param.getBankcard(), param.getIdcard(), param.getName()));
        } catch (Exception e) {
            return CommonResult.fail(500, e.getMessage());
        }
    }

    @Override
    public CommonResult<WechatOpenidDTO> getOpenidByJscode(@RequestParam("jscode") String jscode) {
        String resp = new RestTemplate().getForObject(
            MessageFormat.format(jscode2sessionUrl, wechatMiniprogramAppid, wechatMiniprogramSecret, jscode),
            String.class);
        return CommonResult.success(JSON.parseObject(resp, WechatOpenidDTO.class));
    }

    @Override
    public CommonResult<String> getPhoneByEncryptedData(@RequestParam("data") String data,
        @RequestParam("secretKey") String secretKey, @RequestParam("ivString") String ivString) {
        WechatUserDTO decrypt = WechatUtil.decrypt(data, secretKey, ivString);
        if (!wechatMiniprogramAppid.equals(decrypt.getWatermark().getAppid())) {
            log.error("没找到对应appid:{}", decrypt.getWatermark().getAppid());
            throw new VeBaseException("500");
        }
        log.info("水印时间:{}", decrypt.getWatermark().getTimestamp());
        return CommonResult.success(decrypt.getPurePhoneNumber());
    }

    @Override
    public CommonResult<Object> officialAccountMsg(@RequestBody OfficialAccountMsgParam param) {
        wechatService.officialAccountMsg(param);
        return CommonResult.success();
    }

    @Override
    public CommonResult<Object> sendSms() {
        baseSMSEngine.sendMsg("", "", "", new HashMap<>());
        return CommonResult.success();
    }

}
