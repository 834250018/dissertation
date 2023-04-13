package cn.ve.study.config;

import cn.ve.base.constant.MqConstant;
import cn.ve.base.util.StringConstant;
import cn.ve.study.api.param.MessageMqParam;
import cn.ve.study.api.param.SmsMqParam;
import cn.ve.study.dal.entity.MessageMessage;
import cn.ve.study.dal.entity.MessageMessageTemplate;
import cn.ve.study.dal.mapper.MessageMessageMapper;
import cn.ve.study.dal.mapper.MessageMessageTemplateMapper;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.utils.SerializationUtils;
import org.springframework.context.annotation.DependsOn;

import javax.annotation.Resource;

/**
 * 普通消息队列demo
 *
 * @author ve
 * @date 2021/7/29
 */
@Slf4j
//@Configuration
@DependsOn({"studyMessageMapper", "studyMessageTemplateMapper"})
public class RabbitMQListener {

    @Resource
    MessageMessageMapper studyMessageMapper;
    @Resource
    MessageMessageTemplateMapper studyMessageTemplateMapper;
    //        @Resource
    //        BaseSMSEngine baseSMSEngine;
    @Resource
    private RabbitMQConstant rabbitMQConstant;

    // 消费者使用以下代码
    @RabbitListener(queues = MqConstant.ALL2MESSAGE_MESSAGE_QUEUE)
    public void studyRabbitListener(Message study) {
        try {
            MessageMqParam studyMqParam = (MessageMqParam) SerializationUtils.deserialize(study.getBody());
            log.info(JSON.toJSONString(studyMqParam));
            MessageMessage studyMessage = new MessageMessage();
            studyMessage.setUserId(studyMqParam.getUserId());
            studyMessage.setStatus(0);
            studyMessage.setDetailId(studyMqParam.getDetailId());
            studyMessage.setTemplateId(studyMqParam.getTemplateId());
            MessageMessageTemplate studyMessageTemplate =
                    studyMessageTemplateMapper.selectById(studyMqParam.getTemplateId());
            if (studyMessageTemplate == null || studyMessageTemplate.getStatus() == 0) {
                // 模板不存在或模板未启用,直接丢弃消息
                return;
            }
            studyMessage.setUrl(studyMessageTemplate.getRouteUri());
            studyMessage.setTitle(studyMessageTemplate.getTemplateTitle());
            studyMessage.setContent(studyMessageTemplate.getTemplateContent());
            if (studyMqParam.getParamMap() != null) {
                studyMessage.setParam(JSON.toJSONString(studyMqParam.getParamMap()));
                studyMqParam.getParamMap().forEach((paramName, paramValue) -> {
                    if (StringUtils.isBlank(paramValue)) {
                        log.error("studyRabbitListener_参数{}的值为null", paramName);
                        return;
                    }

                    studyMessage.setTitle(studyMessage.getTitle().replaceAll(StringConstant.POUND + paramName + StringConstant.POUND, paramValue));
                    studyMessage
                            .setContent(studyMessage.getContent().replaceAll(StringConstant.POUND + paramName + StringConstant.POUND, paramValue));
                });
            }
            studyMessageMapper.insert(studyMessage);
        } catch (Exception e) {
            log.error("系统通知服务异常: {}", e.getMessage(), e);
        }
    }

    // 消费者使用以下代码
    @RabbitListener(queues = MqConstant.ALL2MESSAGE_SMS_QUEUE)
    public void smsRabbitListener(Message study) {
        SmsMqParam smsMqParam = (SmsMqParam) SerializationUtils.deserialize(study.getBody());
        log.info(JSON.toJSONString(smsMqParam));
        if (!rabbitMQConstant.getSmsSwitch()) {
            return;
        }
        // todo 发短信
        // todo 持久化到本地数据库
    }
}
