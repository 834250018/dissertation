package cn.ve.thirdgateway.api;

import cn.ve.feign.config.FeignConfiguration;
import cn.ve.feign.pojo.CommonResult;
import cn.ve.thirdgateway.pojo.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "thirdgateway-provider", configuration = FeignConfiguration.class)
public interface ThirdgatewayApi {

    @PostMapping("/thirdgateway/admin/v1_0/idCardOcr")
    CommonResult<IdCardOcrResp> idCardOcr(@RequestBody AliOCRParam aliOCRParam);

    @PostMapping("/thirdgateway/admin/v1_0/bankCardOcr")
    CommonResult<BankCardOcrResp> bankCardOcr(@RequestBody AliOCRParam aliOCRParam);

    @PostMapping("/thirdgateway/admin/v1_0/bankCard3Factor")
    CommonResult<BankCard3FactorResp> bankCard3Factor(@RequestBody Ali3FactorParam param);

    @PostMapping("/thirdgateway/admin/v1_0/getOpenidByJscode")
    CommonResult<WechatOpenidDTO> getOpenidByJscode(@RequestParam("jscode") String jscode);

    @PostMapping("/thirdgateway/admin/v1_0/getPhoneByEncryptedData")
    CommonResult<String> getPhoneByEncryptedData(@RequestParam("data") String data,
        @RequestParam("secretKey") String secretKey, @RequestParam("ivString") String ivString);

    @PostMapping("/thirdgateway/admin/v1_0/officialAccountMsg")
    CommonResult<Object> officialAccountMsg(@RequestBody OfficialAccountMsgParam param);

    @PostMapping("/thirdgateway/admin/v1_0/sendSms")
    CommonResult<Object> sendSms();
}
