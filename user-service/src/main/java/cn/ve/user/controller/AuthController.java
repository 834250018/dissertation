package cn.ve.user.controller;

import cn.ve.base.pojo.RequestHeader;
import cn.ve.base.pojo.RequestHeaderHolder;
import cn.ve.feign.pojo.CommonResult;
import cn.ve.user.dto.AuthMenuRespVO;
import cn.ve.user.dto.AuthPermissionInfoRespVO;
import com.google.common.collect.Sets;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class AuthController extends com.anji.captcha.controller.CaptchaController {


    @PostMapping("/user/auth/get-permission-info")
    public CommonResult<AuthPermissionInfoRespVO> getPermissionInfo() {
        RequestHeader requestHeader = RequestHeaderHolder.get();
        return CommonResult.success(
            new AuthPermissionInfoRespVO()
                .setUser(
                    new AuthPermissionInfoRespVO.UserVO()

                        .setId(requestHeader.getUserId())
                        .setNickname(requestHeader.getNickname())
                        .setAvatar(requestHeader.getHeadPortrait())
                )
                .setRoles(Sets.newHashSet("super_admin"))
                .setPermissions(Sets.newHashSet(
                    "infra:config:create",
                    "system:sms-template:update",
                    "system:menu:query",
                    "infra:file-config:query",
                    "infra:config:export",
                    "pay:refund:delete",
                    "bpm:task-assign-rule:create",
                    "system:user:query",
                    "system:error-code:query",
                    "bpm:oa-leave:create",
                    "infra:file-config:create",
                    "system:user:export",
                    "system:dept:update",
                    "bpm:model:deploy",
                    "bpm:user-group:delete",
                    "infra:api-access-log:export",
                    "bpm:process-instance:create",
                    "pay:merchant:delete",
                    "system:dept:query",
                    "infra:file-config:export",
                    "infra:test-demo:create",
                    "system:tenant-package:delete",
                    "system:role:delete",
                    "system:dept:create",
                    "system:notice:update",
                    "bpm:task-assign-rule:query",
                    "system:menu:create",
                    "system:tenant:query",
                    "infra:codegen:download",
                    "infra:test-demo:export",
                    "system:dict:query",
                    "bpm:model:delete",
                    "bpm:model:import",
                    "infra:api-error-log:query",
                    "system:dict:update",
                    "pay:app:query",
                    "pay:app:export",
                    "infra:test-demo:query",
                    "pay:order:delete",
                    "system:notice:create",
                    "system:sms-log:query",
                    "infra:job:delete",
                    "infra:test-demo:update",
                    "system:tenant:export",
                    "system:post:update",
                    "infra:api-error-log:update-status",
                    "system:tenant:create",
                    "pay:merchant:export",
                    "system:error-code:update",
                    "system:post:export",
                    "infra:file:delete",
                    "system:sms-template:create",
                    "infra:job:trigger",
                    "system:sms-channel:update",
                    "system:sms-channel:query",
                    "pay:order:query",
                    "system:menu:update",
                    "system:login-log:query",
                    "system:role:update",
                    "bpm:form:query",
                    "system:notice:delete",
                    "system:login-log:export",
                    "system:user:create",
                    "system:role:export",
                    "pay:order:export",
                    "bpm:model:update",
                    "infra:file-config:update",
                    "pay:merchant:query",
                    "system:permission:assign-user-role",
                    "system:post:delete",
                    "pay:order:update",
                    "infra:config:update",
                    "infra:job:update",
                    "infra:job:export",
                    "bpm:task-assign-rule:update",
                    "pay:refund:create",
                    "bpm:process-definition:query",
                    "pay:app:delete",
                    "infra:api-error-log:export",
                    "bpm:model:query",
                    "system:error-code:export",
                    "pay:refund:update",
                    "infra:job:create",
                    "system:permission:assign-role-menu",
                    "infra:config:query",
                    "system:sms-template:send-sms",
                    "bpm:user-group:query",
                    "system:dept:delete",
                    "system:tenant:update",
                    "pay:channel:parsing",
                    "system:error-code:create",
                    "system:tenant-package:update",
                    "infra:codegen:create",
                    "system:user-session:delete",
                    "system:sms-template:delete",
                    "bpm:user-group:update",
                    "pay:merchant:update",
                    "infra:file-config:delete",
                    "infra:codegen:preview",
                    "bpm:process-instance:query",
                    "bpm:task:query",
                    "system:dict:create",
                    "infra:api-access-log:query",
                    "pay:refund:query",
                    "infra:redis:get-monitor-info",
                    "system:notice:query",
                    "bpm:form:update",
                    "infra:file:query",
                    "system:user-session:list",
                    "pay:app:update",
                    "infra:config:delete",
                    "bpm:oa-leave:query",
                    "system:user:update-password",
                    "bpm:process-instance:cancel",
                    "bpm:form:create",
                    "system:dict:export",
                    "system:post:query",
                    "bpm:form:export",
                    "system:sms-channel:create",
                    "system:post:create",
                    "bpm:user-group:create",
                    "infra:codegen:delete",
                    "infra:redis:get-key-list",
                    "system:user:delete",
                    "system:sms-template:export",
                    "pay:merchant:create",
                    "infra:build:list",
                    "infra:codegen:update",
                    "bpm:task:update",
                    "system:user:import",
                    "infra:swagger:list",
                    "infra:job:query",
                    "pay:app:create",
                    "system:user:update",
                    "system:menu:delete",
                    "system:sms-template:query",
                    "bpm:model:create",
                    "system:error-code:delete",
                    "system:permission:assign-role-data-scope",
                    "pay:order:create",
                    "system:tenant-package:create",
                    "system:user:list",
                    "system:operate-log:query",
                    "system:sms-log:export",
                    "infra:codegen:query",
                    "infra:test-demo:delete",
                    "system:sms-channel:delete",
                    "system:tenant:delete",
                    "system:tenant-package:query",
                    "system:role:create",
                    "bpm:form:delete",
                    "system:dict:delete",
                    "system:operate-log:export",
                    "system:role:query",
                    "pay:refund:export"


                ))
        );
    }


    @PostMapping("/user/auth/list-menus")
    public CommonResult<List<AuthMenuRespVO>> getMenus() {

        List<AuthMenuRespVO> authMenuRespVOS = Arrays.asList(
            new AuthMenuRespVO()
                .setId(1L)
                .setParentId(0L)
                .setName("系统管理")
                .setPath("/system")
                .setComponent(null)
                .setIcon("system")
                .setChildren(
                    Arrays.asList(
                        new AuthMenuRespVO()
                            .setId(1224L)
                            .setParentId(1L)
                            .setName("租户管理")
                            .setPath("tenant")
                            .setComponent(null)
                            .setIcon("peoples")
                            .setChildren(
                                Arrays.asList(
                                    new AuthMenuRespVO()
                                        .setId(1138L)
                                        .setParentId(1224L)
                                        .setName("租户列表")
                                        .setPath("list")
                                        .setComponent("system/tenant/index")
                                        .setIcon("peoples")
                                        .setChildren(null),
                                    new AuthMenuRespVO()
                                        .setId(1225L)
                                        .setParentId(1224L)
                                        .setName("租户套餐")
                                        .setPath("package")
                                        .setComponent("system/tenantPackage/index")
                                        .setIcon("eye")
                                        .setChildren(null)
                                )
                            ),
                        new AuthMenuRespVO()
                            .setId(100L)
                            .setParentId(1L)
                            .setName("用户管理")
                            .setPath("user")
                            .setComponent("system/user/index")
                            .setIcon("user")
                            .setChildren(null),
                        new AuthMenuRespVO()
                            .setId(101L)
                            .setParentId(1L)
                            .setName("角色管理")
                            .setPath("role")
                            .setComponent("system/role/index")
                            .setIcon("peoples")
                            .setChildren(null),
                        new AuthMenuRespVO()
                            .setId(102L)
                            .setParentId(1L)
                            .setName("菜单管理")
                            .setPath("menu")
                            .setComponent("system/menu/index")
                            .setIcon("tree-table")
                            .setChildren(null),
                        new AuthMenuRespVO()
                            .setId(103L)
                            .setParentId(1L)
                            .setName("部门管理")
                            .setPath("dept")
                            .setComponent("system/dept/index")
                            .setIcon("tree")
                            .setChildren(null),
                        new AuthMenuRespVO()
                            .setId(104L)
                            .setParentId(1L)
                            .setName("岗位管理")
                            .setPath("post")
                            .setComponent("system/post/index")
                            .setIcon("post")
                            .setChildren(null),
                        new AuthMenuRespVO()
                            .setId(105L)
                            .setParentId(1L)
                            .setName("字典管理")
                            .setPath("dict")
                            .setComponent("system/dict/index")
                            .setIcon("dict")
                            .setChildren(null),
                        new AuthMenuRespVO()
                            .setId(107L)
                            .setParentId(1L)
                            .setName("通知公告")
                            .setPath("notice")
                            .setComponent("system/notice/index")
                            .setIcon("message")
                            .setChildren(null),
                        new AuthMenuRespVO()
                            .setId(108L)
                            .setParentId(1L)
                            .setName("审计日志")
                            .setPath("log")
                            .setComponent("")
                            .setIcon("log")
                            .setChildren(Arrays.asList(

                                new AuthMenuRespVO()
                                    .setId(500L)
                                    .setParentId(108L)
                                    .setName("操作日志")
                                    .setPath("operate-log")
                                    .setComponent("system/operatelog/index")
                                    .setIcon("form")
                                    .setChildren(null),
                                new AuthMenuRespVO()
                                    .setId(501L)
                                    .setParentId(108L)
                                    .setName("登录日志")
                                    .setPath("login-log")
                                    .setComponent("system/loginlog/index")
                                    .setIcon("logininfor")
                                    .setChildren(null)
                            )),
                        new AuthMenuRespVO()
                            .setId(109L)
                            .setParentId(1L)
                            .setName("在线用户")
                            .setPath("user-session")
                            .setComponent("system/session/index")
                            .setIcon("online")
                            .setChildren(null),
                        new AuthMenuRespVO()
                            .setId(1093L)
                            .setParentId(1L)
                            .setName("短信管理")
                            .setPath("sms")
                            .setComponent(null)
                            .setIcon("validCode")
                            .setChildren(Arrays.asList(
                                new AuthMenuRespVO()
                                    .setId(1094L)
                                    .setParentId(1093L)
                                    .setName("短信渠道")
                                    .setPath("sms-channel")
                                    .setComponent("system/sms/smsChannel")
                                    .setIcon("phone")
                                    .setChildren(null),
                                new AuthMenuRespVO()
                                    .setId(1100L)
                                    .setParentId(1093L)
                                    .setName("短信模板")
                                    .setPath("sms-template")
                                    .setComponent("system/sms/smsTemplate")
                                    .setIcon("phone")
                                    .setChildren(null),
                                new AuthMenuRespVO()
                                    .setId(1107L)
                                    .setParentId(1093L)
                                    .setName("短信日志")
                                    .setPath("sms-log")
                                    .setComponent("system/sms/smsLog")
                                    .setIcon("phone")
                                    .setChildren(null)

                            )),
                        new AuthMenuRespVO()
                            .setId(1110L)
                            .setParentId(1L)
                            .setName("错误码管理")
                            .setPath("error-code")
                            .setComponent("system/errorCode/index")
                            .setIcon("code")
                            .setChildren(null)
                    )
                ),
            new AuthMenuRespVO()
                .setId(1117L)
                .setParentId(0L)
                .setName("支付管理")
                .setPath("/pay")
                .setComponent(null)
                .setIcon("money")
                .setChildren(Arrays.asList(

                    new AuthMenuRespVO()
                        .setId(1179L)
                        .setParentId(1117L)
                        .setName("商户信息")
                        .setPath("merchant")
                        .setComponent("pay/merchant/index")
                        .setIcon("merchant")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(1126L)
                        .setParentId(1117L)
                        .setName("应用信息")
                        .setPath("app")
                        .setComponent("pay/app/index")
                        .setIcon("table")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(1173L)
                        .setParentId(1117L)
                        .setName("支付订单")
                        .setPath("order")
                        .setComponent("pay/order/index")
                        .setIcon("pay")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(1161L)
                        .setParentId(1117L)
                        .setName("退款订单")
                        .setPath("refund")
                        .setComponent("pay/refund/index")
                        .setIcon("order")
                        .setChildren(null)
                )),
            new AuthMenuRespVO()
                .setId(2L)
                .setParentId(0L)
                .setName("基础设施")
                .setPath("/infra")
                .setComponent(null)
                .setIcon("monitor")
                .setChildren(Arrays.asList(

                    new AuthMenuRespVO()
                        .setId(115L)
                        .setParentId(2L)
                        .setName("代码生成")
                        .setPath("codegen")
                        .setComponent("infra/codegen/index")
                        .setIcon("code")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(1070L)
                        .setParentId(2L)
                        .setName("代码生成示例")
                        .setPath("test-demo")
                        .setComponent("infra/testDemo/index")
                        .setIcon("validCode")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(114L)
                        .setParentId(2L)
                        .setName("表单构建")
                        .setPath("build")
                        .setComponent("infra/build/index")
                        .setIcon("build")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(116L)
                        .setParentId(2L)
                        .setName("系统接口")
                        .setPath("swagger")
                        .setComponent("infra/swagger/index")
                        .setIcon("swagger")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(1076L)
                        .setParentId(2L)
                        .setName("数据库文档")
                        .setPath("db-doc")
                        .setComponent("infra/dbDoc/index")
                        .setIcon("table")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(1243L)
                        .setParentId(2L)
                        .setName("文件管理")
                        .setPath("file")
                        .setComponent(null)
                        .setIcon("download")
                        .setChildren(Arrays.asList(

                            new AuthMenuRespVO()
                                .setId(1237L)
                                .setParentId(1243L)
                                .setName("文件配置")
                                .setPath("file-config")
                                .setComponent("infra/fileConfig/index")
                                .setIcon("config")
                                .setChildren(null),
                            new AuthMenuRespVO()
                                .setId(1090L)
                                .setParentId(1243L)
                                .setName("文件列表")
                                .setPath("file")
                                .setComponent("infra/file/index")
                                .setIcon("upload")
                                .setChildren(null)
                        )),
                    new AuthMenuRespVO()
                        .setId(106L)
                        .setParentId(2L)
                        .setName("配置管理")
                        .setPath("config")
                        .setComponent("infra/config/index")
                        .setIcon("edit")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(1083L)
                        .setParentId(2L)
                        .setName("API 日志")
                        .setPath("log")
                        .setComponent(null)
                        .setIcon("log")
                        .setChildren(Arrays.asList(

                            new AuthMenuRespVO()
                                .setId(1078L)
                                .setParentId(1083L)
                                .setName("访问日志")
                                .setPath("api-access-log")
                                .setComponent("infra/apiAccessLog/index")
                                .setIcon("log")
                                .setChildren(null),
                            new AuthMenuRespVO()
                                .setId(1084L)
                                .setParentId(1083L)
                                .setName("错误日志")
                                .setPath("api-error-log")
                                .setComponent("infra/apiErrorLog/index")
                                .setIcon("log")
                                .setChildren(null)
                        )),
                    new AuthMenuRespVO()
                        .setId(111L)
                        .setParentId(2L)
                        .setName("MySQL 监控")
                        .setPath("druid")
                        .setComponent("infra/druid/index")
                        .setIcon("druid")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(113L)
                        .setParentId(2L)
                        .setName("Redis 监控")
                        .setPath("redis")
                        .setComponent("infra/redis/index")
                        .setIcon("redis")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(112L)
                        .setParentId(2L)
                        .setName("Java 监控")
                        .setPath("admin-server")
                        .setComponent("infra/server")
                        .setIcon("server")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(110L)
                        .setParentId(2L)
                        .setName("定时任务")
                        .setPath("job")
                        .setComponent("infra/job/index")
                        .setIcon("job")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(1077L)
                        .setParentId(2L)
                        .setName("链路追踪")
                        .setPath("skywalking")
                        .setComponent("infra/skywalking")
                        .setIcon("eye-open")
                        .setChildren(null),
                    new AuthMenuRespVO()
                        .setId(1116L)
                        .setParentId(2L)
                        .setName("日志中心")
                        .setPath("log-center")
                        .setComponent("infra/skywalking/log")
                        .setIcon("log")
                        .setChildren(null)
                )),
            new AuthMenuRespVO()
                .setId(1185L)
                .setParentId(0L)
                .setName("工作流程")
                .setPath("/bpm")
                .setComponent(null)
                .setIcon("tool")
                .setChildren(Arrays.asList(

                    new AuthMenuRespVO()
                        .setId(1186L)
                        .setParentId(1185L)
                        .setName("流程管理")
                        .setPath("manager")
                        .setComponent(null)
                        .setIcon("nested")
                        .setChildren(Arrays.asList(

                            new AuthMenuRespVO()
                                .setId(1187L)
                                .setParentId(1186L)
                                .setName("流程表单")
                                .setPath("form")
                                .setComponent("bpm/form/index")
                                .setIcon("form")
                                .setChildren(null),
                            new AuthMenuRespVO()
                                .setId(1209L)
                                .setParentId(1186L)
                                .setName("用户分组")
                                .setPath("user-group")
                                .setComponent("bpm/group/index")
                                .setIcon("people")
                                .setChildren(null),
                            new AuthMenuRespVO()
                                .setId(1193L)
                                .setParentId(1186L)
                                .setName("流程模型")
                                .setPath("model")
                                .setComponent("bpm/model/index")
                                .setIcon("guide")
                                .setChildren(null)
                        )),
                    new AuthMenuRespVO()
                        .setId(1200L)
                        .setParentId(1185L)
                        .setName("任务管理")
                        .setPath("task")
                        .setComponent(null)
                        .setIcon("cascader")
                        .setChildren(Arrays.asList(

                            new AuthMenuRespVO()
                                .setId(1201L)
                                .setParentId(1200L)
                                .setName("我的流程")
                                .setPath("my")
                                .setComponent("bpm/processInstance/index")
                                .setIcon("people")
                                .setChildren(null),
                            new AuthMenuRespVO()
                                .setId(1207L)
                                .setParentId(1200L)
                                .setName("待办任务")
                                .setPath("todo")
                                .setComponent("bpm/task/todo")
                                .setIcon("eye-open")
                                .setChildren(null),
                            new AuthMenuRespVO()
                                .setId(1208L)
                                .setParentId(1200L)
                                .setName("已办任务")
                                .setPath("done")
                                .setComponent("bpm/task/done")
                                .setIcon("eye")
                                .setChildren(null)
                        )),
                    new AuthMenuRespVO()
                        .setId(5L)
                        .setParentId(1185L)
                        .setName("OA 示例")
                        .setPath("oa")
                        .setComponent(null)
                        .setIcon("people")
                        .setChildren(Arrays.asList(
                            new AuthMenuRespVO()
                                .setId(1118L)
                                .setParentId(5L)
                                .setName("请假查询")
                                .setPath("leave")
                                .setComponent("bpm/oa/leave/index")
                                .setIcon("user")
                                .setChildren(null)
                        ))
                ))
        );

        return CommonResult.success(authMenuRespVOS);
    }

}