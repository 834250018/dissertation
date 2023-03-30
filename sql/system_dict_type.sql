DROP TABLE IF EXISTS "system_dict_type";
CREATE TABLE "system_dict_type"
(
    id           bigint                                      not null
        constraint system_dict_type_pkey
            primary key,

    "name"       varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
    "type"       varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
    "status"     int2                                        NOT NULL,

    creator_id   bigint,
    updater_id   bigint,
    creator_name varchar,
    updater_name varchar,
    create_time  bigint,
    update_time  bigint,
    deleted      smallint default 0,
    versions     int,
    remark       varchar
)
;
comment on column system_dict_type.id is '主键id';
comment on column system_dict_type.creator_id is '创建人id';
comment on column system_dict_type.updater_id is '修改人id';
comment on column system_dict_type.create_time is '创建时间';
comment on column system_dict_type.update_time is '修改时间';
comment on column system_dict_type.creator_name is '创建人名称';
comment on column system_dict_type.updater_name is '修改人名称';
comment on column system_dict_type.deleted is '是否被删除:0.未删除;1.已删除';
comment on column system_dict_type.versions is '版本号';
comment on column system_dict_type.remark is '备注';
COMMENT ON COLUMN "system_dict_type"."id" IS '字典主键';
COMMENT ON COLUMN "system_dict_type"."name" IS '字典名称';
COMMENT ON COLUMN "system_dict_type"."type" IS '字典类型';
COMMENT ON COLUMN "system_dict_type"."status" IS '状态（0正常 1停用）';
COMMENT ON TABLE "system_dict_type" IS '字典类型表';

alter table system_dict_type
    owner to test;

-- ----------------------------
-- Records of system_dict_type
-- ----------------------------
BEGIN;
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (1, '用户性别', 'system_user_sex', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (6, '参数类型', 'infra_config_type', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (7, '通知类型', 'system_notice_type', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (9, '操作类型', 'system_operate_type', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (10, '系统状态', 'common_status', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (11, 'Boolean 是否类型', 'infra_boolean_string', 0, 'boolean 转是否', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (104, '登陆结果', 'system_login_result', 0, '登陆结果', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (105, 'Redis 超时类型', 'infra_redis_timeout_type', 0, 'RedisKeyDefine.TimeoutTypeEnum', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (106, '代码生成模板类型', 'infra_codegen_template_type', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (107, '定时任务状态', 'infra_job_status', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (108, '定时任务日志状态', 'infra_job_log_status', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (109, '用户类型', 'user_type', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (110, 'API 异常数据的处理状态', 'infra_api_error_log_process_status', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (111, '短信渠道编码', 'system_sms_channel_code', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (112, '短信模板的类型', 'system_sms_template_type', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (113, '短信发送状态', 'system_sms_send_status', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (114, '短信接收状态', 'system_sms_receive_status', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (115, '错误码的类型', 'system_error_code_type', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (116, '登陆日志的类型', 'system_login_type', 0, '登陆日志的类型', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (117, 'OA 请假类型', 'bpm_oa_leave_type', 0, NULL, 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (122, '支付渠道微信版本', 'pay_channel_wechat_version', 0, '支付渠道微信版本', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (127, '支付渠道支付宝算法类型', 'pay_channel_alipay_sign_type', 0, '支付渠道支付宝算法类型', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (128, '支付渠道支付宝公钥类型', 'pay_channel_alipay_mode', 0, '支付渠道支付宝公钥类型', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (129, '支付宝网关地址', 'pay_channel_alipay_server_type', 0, '支付宝网关地址', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (130, '支付渠道编码类型', 'pay_channel_code_type', 0, '支付渠道的编码', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (131, '支付订单回调状态', 'pay_order_notify_status', 0, '支付订单回调状态', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (132, '支付订单状态', 'pay_order_status', 0, '支付订单状态', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (133, '支付订单退款状态', 'pay_order_refund_status', 0, '支付订单退款状态', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (134, '退款订单状态', 'pay_refund_order_status', 0, '退款订单状态', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (135, '退款订单类别', 'pay_refund_order_type', 0, '退款订单类别', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (138, '流程分类', 'bpm_model_category', 0, '流程分类', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (139, '流程实例的状态', 'bpm_process_instance_status', 0, '流程实例的状态', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (140, '流程实例的结果', 'bpm_process_instance_result', 0, '流程实例的结果', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (141, '流程的表单类型', 'bpm_model_form_type', 0, '流程的表单类型', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (142, '任务分配规则的类型', 'bpm_task_assign_rule_type', 0, '任务分配规则的类型', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (143, '任务分配自定义脚本', 'bpm_task_assign_script', 0, '任务分配自定义脚本', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (144, '代码生成的场景枚举', 'infra_codegen_scene', 0, '代码生成的场景枚举', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (145, '角色类型', 'system_role_type', 0, '角色类型', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (146, '文件存储器', 'infra_file_storage', 0, '文件存储器', 0);
INSERT INTO "system_dict_type" ("id", "name", "type", "status", "remark", "deleted")
VALUES (147, 'OAuth 2.0 授权类型', 'system_oauth2_grant_type', 0, 'OAuth 2.0 授权类型（模式）', 0);
COMMIT;
