package cn.ve.study.controller;

import cn.ve.study.config.OpenAIConfig;
import cn.ve.study.dal.mapper.MessageMessageMapper;
import cn.ve.study.param.MessageMessageQO;
import cn.ve.rest.pojo.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 系统消息
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/messageMessage")
public class MessageMessageController extends BaseController {

    @Resource
    private MessageMessageMapper messageMessageMapper;

    /**
     * 查询分页
     *
     * @param qo
     * @return
     */
//    @PostMapping("/v1_0/page")
//    public PageInfo<MessageMessageDTO> queryPage(@ModelAttribute @Valid MessageMessageQO qo) {
//        qo.setUserId(getUserId());
//        return PageInfo.of(BeanUtils
//            .copyList(messageMessageMapper.selectList(new LambdaQueryWrapper<>()), MessageMessageDTO.class));
//    }

    /**
     * 查询分页,并根据当前类型消除红点
     *
     * @param qo
     * @return
     */
//    @PostMapping("/v1.1.2/pageAndRead")
//    public PageInfo<MessageMessageDTO> pageAndRead(@ModelAttribute @Valid MessageMessageQO qo) {
//        qo.setUserId(getUserId());
//        PageInfo<MessageMessageDTO> of = PageInfo.of(BeanUtils
//            .copyList(messageMessageMapper.selectList(new LambdaQueryWrapper<>()), MessageMessageDTO.class));
//
//        // todo 已读此模板类型所有消息
//        //        messageSystemAlertExtMapper.readByTemplateType(qo);
//
//        return of;
//    }

    /**
     * 我已知晓消息(对某个消息进行已读)
     *
     * @param messageId
     */
    @PostMapping("/v1_0/confirm")
    public void confirm(@RequestParam Long messageId) {
        // todo
        //        messageSystemAlertExtMapper.readById(messageId);
    }

    /**
     * 我已知晓消息(对某个模板下的消息进行已读)
     *
     * @param qo
     */
    @PostMapping("/v1_0/confirmByQO")
    public void confirmByQO(@ModelAttribute @Valid MessageMessageQO qo) {
        qo.setUserId(getUserId());
        // todo
        //        messageSystemAlertExtMapper.readByQO(qo);
    }

    @Autowired
    private OpenAIConfig openAIConfig;

    /**
     * 我已知晓消息(对某个模板下的消息进行已读)
     *
     * @param qo
     */
    @GetMapping("/v1_0/test")
    public void test() {
        openAIConfig.te1();
    }

}

