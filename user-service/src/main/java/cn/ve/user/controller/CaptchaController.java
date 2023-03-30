package cn.ve.user.controller;

import com.anji.captcha.model.common.ResponseModel;
import com.anji.captcha.model.vo.CaptchaVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;

@RestController("adminCaptchaController")
@RequestMapping("/system/captcha")
public class CaptchaController extends com.anji.captcha.controller.CaptchaController {

    @PostMapping({"/get"})
    @PermitAll
    @Override
    public ResponseModel get(@RequestBody CaptchaVO data, HttpServletRequest request) {
        return super.get(data, request);
    }

    @PostMapping("/check")
    @PermitAll
    @Override
    public ResponseModel check(@RequestBody CaptchaVO data, HttpServletRequest request) {
        return super.check(data, request);
    }

}