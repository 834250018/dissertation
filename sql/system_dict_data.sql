-- ----------------------------
-- Table structure for system_dict_data
-- ----------------------------
DROP TABLE IF EXISTS "system_dict_data";
CREATE TABLE "system_dict_data"
(
    id           bigint                                      not null
        constraint system_dict_data_pkey
            primary key,

    "sort"       int4                                        NOT NULL,
    "label"      varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
    "value"      varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
    "dict_type"  varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
    "status"     int2                                        NOT NULL,
    "color_type" varchar(100) COLLATE "pg_catalog"."default",
    "css_class"  varchar(100) COLLATE "pg_catalog"."default",

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
comment on column system_dict_data.id is '主键id';
comment on column system_dict_data.creator_id is '创建人id';
comment on column system_dict_data.updater_id is '修改人id';
comment on column system_dict_data.create_time is '创建时间';
comment on column system_dict_data.update_time is '修改时间';
comment on column system_dict_data.creator_name is '创建人名称';
comment on column system_dict_data.updater_name is '修改人名称';
comment on column system_dict_data.deleted is '是否被删除:0.未删除;1.已删除';
comment on column system_dict_data.versions is '版本号';
comment on column system_dict_data.remark is '备注';
COMMENT ON COLUMN "system_dict_data"."sort" IS '字典排序';
COMMENT ON COLUMN "system_dict_data"."label" IS '字典标签';
COMMENT ON COLUMN "system_dict_data"."value" IS '字典键值';
COMMENT ON COLUMN "system_dict_data"."dict_type" IS '字典类型';
COMMENT ON COLUMN "system_dict_data"."status" IS '状态（0正常 1停用）';
COMMENT ON COLUMN "system_dict_data"."color_type" IS '颜色类型';
COMMENT ON COLUMN "system_dict_data"."css_class" IS 'css 样式';
COMMENT ON TABLE "system_dict_data" IS '字典数据表';

alter table system_dict_data
    owner to test;

-- ----------------------------
-- Records of system_dict_data
-- ----------------------------
BEGIN;
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1, 1, '男', '1', 'system_user_sex', 0, 'default', 'A', '性别男', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (2, 2, '女', '2', 'system_user_sex', 1, 'success', '', '性别女', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (8, 1, '正常', '1', 'infra_job_status', 0, 'success', '', '正常状态', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (9, 2, '暂停', '2', 'infra_job_status', 0, 'danger', '', '停用状态', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (12, 1, '系统内置', '1', 'infra_config_type', 0, 'danger', '', '参数类型 - 系统内置', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (13, 2, '自定义', '2', 'infra_config_type', 0, 'primary', '', '参数类型 - 自定义', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (14, 1, '通知', '1', 'system_notice_type', 0, 'success', '', '通知', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (15, 2, '公告', '2', 'system_notice_type', 0, 'info', '', '公告', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (16, 0, '其它', '0', 'system_operate_type', 0, 'default', '', '其它操作', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (17, 1, '查询', '1', 'system_operate_type', 0, 'info', '', '查询操作', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (18, 2, '新增', '2', 'system_operate_type', 0, 'primary', '', '新增操作', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (19, 3, '修改', '3', 'system_operate_type', 0, 'warning', '', '修改操作', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (20, 4, '删除', '4', 'system_operate_type', 0, 'danger', '', '删除操作', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (22, 5, '导出', '5', 'system_operate_type', 0, 'default', '', '导出操作', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (23, 6, '导入', '6', 'system_operate_type', 0, 'default', '', '导入操作', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (27, 1, '开启', '0', 'common_status', 0, 'primary', '', '开启状态', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (28, 2, '关闭', '1', 'common_status', 0, 'info', '', '关闭状态', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (29, 1, '目录', '1', 'system_menu_type', 0, '', '', '目录', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (30, 2, '菜单', '2', 'system_menu_type', 0, '', '', '菜单', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (31, 3, '按钮', '3', 'system_menu_type', 0, '', '', '按钮', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (32, 1, '内置', '1', 'system_role_type', 0, 'danger', '', '内置角色', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (33, 2, '自定义', '2', 'system_role_type', 0, 'primary', '', '自定义角色', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (34, 1, '全部数据权限', '1', 'system_data_scope', 0, '', '', '全部数据权限', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (35, 2, '指定部门数据权限', '2', 'system_data_scope', 0, '', '', '指定部门数据权限', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (36, 3, '本部门数据权限', '3', 'system_data_scope', 0, '', '', '本部门数据权限', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (37, 4, '本部门及以下数据权限', '4', 'system_data_scope', 0, '', '', '本部门及以下数据权限', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (38, 5, '仅本人数据权限', '5', 'system_data_scope', 0, '', '', '仅本人数据权限', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (39, 0, '成功', '0', 'system_login_result', 0, 'success', '', '登陆结果 - 成功', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (40, 10, '账号或密码不正确', '10', 'system_login_result', 0, 'primary', '', '登陆结果 - 账号或密码不正确', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (41, 20, '用户被禁用', '20', 'system_login_result', 0, 'warning', '', '登陆结果 - 用户被禁用', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (42, 30, '验证码不存在', '30', 'system_login_result', 0, 'info', '', '登陆结果 - 验证码不存在', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (43, 31, '验证码不正确', '31', 'system_login_result', 0, 'info', '', '登陆结果 - 验证码不正确', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (44, 100, '未知异常', '100', 'system_login_result', 0, 'danger', '', '登陆结果 - 未知异常', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (45, 1, '是', 'true', 'infra_boolean_string', 0, 'danger', '', 'Boolean 是否类型 - 是', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (46, 1, '否', 'false', 'infra_boolean_string', 0, 'info', '', 'Boolean 是否类型 - 否', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (47, 1, '永不超时', '1', 'infra_redis_timeout_type', 0, 'primary', '', 'Redis 未设置超时的情况', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (48, 1, '动态超时', '2', 'infra_redis_timeout_type', 0, 'info', '', '程序里动态传入超时时间，无法固定', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (49, 3, '固定超时', '3', 'infra_redis_timeout_type', 0, 'success', '', 'Redis 设置了过期时间', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (50, 1, '单表（增删改查）', '1', 'infra_codegen_template_type', 0, '', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (51, 2, '树表（增删改查）', '2', 'infra_codegen_template_type', 0, '', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (53, 0, '初始化中', '0', 'infra_job_status', 0, 'primary', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (57, 0, '运行中', '0', 'infra_job_log_status', 0, 'primary', '', 'RUNNING', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (58, 1, '成功', '1', 'infra_job_log_status', 0, 'success', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (59, 2, '失败', '2', 'infra_job_log_status', 0, 'warning', '', '失败', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (60, 1, '会员', '1', 'user_type', 0, 'primary', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (61, 2, '管理员', '2', 'user_type', 0, 'success', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (62, 0, '未处理', '0', 'infra_api_error_log_process_status', 0, 'primary', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (63, 1, '已处理', '1', 'infra_api_error_log_process_status', 0, 'success', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (64, 2, '已忽略', '2', 'infra_api_error_log_process_status', 0, 'danger', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (66, 2, '阿里云', 'ALIYUN', 'system_sms_channel_code', 0, 'primary', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (67, 1, '验证码', '1', 'system_sms_template_type', 0, 'warning', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (68, 2, '通知', '2', 'system_sms_template_type', 0, 'primary', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (69, 0, '营销', '3', 'system_sms_template_type', 0, 'danger', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (70, 0, '初始化', '0', 'system_sms_send_status', 0, 'primary', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (71, 1, '发送成功', '10', 'system_sms_send_status', 0, 'success', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (72, 2, '发送失败', '20', 'system_sms_send_status', 0, 'danger', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (73, 3, '不发送', '30', 'system_sms_send_status', 0, 'info', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (74, 0, '等待结果', '0', 'system_sms_receive_status', 0, 'primary', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (75, 1, '接收成功', '10', 'system_sms_receive_status', 0, 'success', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (76, 2, '接收失败', '20', 'system_sms_receive_status', 0, 'danger', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (77, 0, '调试(钉钉)', 'DEBUG_DING_TALK', 'system_sms_channel_code', 0, 'info', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (78, 1, '自动生成', '1', 'system_error_code_type', 0, 'warning', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (79, 2, '手动编辑', '2', 'system_error_code_type', 0, 'primary', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (80, 100, '账号登录', '100', 'system_login_type', 0, 'primary', '', '账号登录', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (81, 101, '社交登录', '101', 'system_login_type', 0, 'info', '', '社交登录', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (83, 200, '主动登出', '200', 'system_login_type', 0, 'primary', '', '主动登出', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (85, 202, '强制登出', '202', 'system_login_type', 0, 'danger', '', '强制退出', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (86, 0, '病假', '1', 'bpm_oa_leave_type', 0, 'primary', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (87, 1, '事假', '2', 'bpm_oa_leave_type', 0, 'info', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (88, 2, '婚假', '3', 'bpm_oa_leave_type', 0, 'warning', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (98, 1, 'v2', 'v2', 'pay_channel_wechat_version', 0, '', '', 'v2版本', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (99, 2, 'v3', 'v3', 'pay_channel_wechat_version', 0, '', '', 'v3版本', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (108, 1, 'RSA2', 'RSA2', 'pay_channel_alipay_sign_type', 0, '', '', 'RSA2', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (109, 1, '公钥模式', '1', 'pay_channel_alipay_mode', 0, '', '', '公钥模式：privateKey + alipayPublicKey', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (110, 2, '证书模式', '2', 'pay_channel_alipay_mode', 0, '', '',
        '证书模式：appCertContent + alipayPublicCertContent + rootCertContent', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (111, 1, '线上', 'https://openapi.alipay.com/gateway.do', 'pay_channel_alipay_server_type', 0, '', '', '网关地址 - 线上',
        0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (112, 2, '沙箱', 'https://openapi.alipaydev.com/gateway.do', 'pay_channel_alipay_server_type', 0, '', '',
        '网关地址 - 沙箱', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (113, 1, '微信 JSAPI 支付', 'wx_pub', 'pay_channel_code_type', 0, '', '', '微信 JSAPI（公众号） 支付', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (114, 2, '微信小程序支付', 'wx_lite', 'pay_channel_code_type', 0, '', '', '微信小程序支付', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (115, 3, '微信 App 支付', 'wx_app', 'pay_channel_code_type', 0, '', '', '微信 App 支付', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (116, 4, '支付宝 PC 网站支付', 'alipay_pc', 'pay_channel_code_type', 0, '', '', '支付宝 PC 网站支付', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (117, 5, '支付宝 Wap 网站支付', 'alipay_wap', 'pay_channel_code_type', 0, '', '', '支付宝 Wap 网站支付', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (118, 6, '支付宝App 支付', 'alipay_app', 'pay_channel_code_type', 0, '', '', '支付宝App 支付', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (119, 7, '支付宝扫码支付', 'alipay_qr', 'pay_channel_code_type', 0, '', '', '支付宝扫码支付', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (120, 1, '通知成功', '10', 'pay_order_notify_status', 0, 'success', '', '通知成功', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (121, 2, '通知失败', '20', 'pay_order_notify_status', 0, 'danger', '', '通知失败', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (122, 3, '未通知', '0', 'pay_order_notify_status', 0, 'info', '', '未通知', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (123, 1, '支付成功', '10', 'pay_order_status', 0, 'success', '', '支付成功', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (124, 2, '支付关闭', '20', 'pay_order_status', 0, 'danger', '', '支付关闭', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (125, 3, '未支付', '0', 'pay_order_status', 0, 'info', '', '未支付', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (126, 1, '未退款', '0', 'pay_order_refund_status', 0, '', '', '未退款', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (127, 2, '部分退款', '10', 'pay_order_refund_status', 0, '', '', '部分退款', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (128, 3, '全部退款', '20', 'pay_order_refund_status', 0, '', '', '全部退款', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1117, 1, '退款订单生成', '0', 'pay_refund_order_status', 0, 'primary', '', '退款订单生成', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1118, 2, '退款成功', '1', 'pay_refund_order_status', 0, 'success', '', '退款成功', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1119, 3, '退款失败', '2', 'pay_refund_order_status', 0, 'danger', '', '退款失败', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1124, 8, '退款关闭', '99', 'pay_refund_order_status', 0, 'info', '', '退款关闭', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1125, 0, '默认', '1', 'bpm_model_category', 0, 'primary', '', '流程分类 - 默认', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1126, 0, 'OA', '2', 'bpm_model_category', 0, 'success', '', '流程分类 - OA', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1127, 0, '进行中', '1', 'bpm_process_instance_status', 0, 'primary', '', '流程实例的状态 - 进行中', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1128, 2, '已完成', '2', 'bpm_process_instance_status', 0, 'success', '', '流程实例的状态 - 已完成', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1129, 1, '处理中', '1', 'bpm_process_instance_result', 0, 'primary', '', '流程实例的结果 - 处理中', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1130, 2, '通过', '2', 'bpm_process_instance_result', 0, 'success', '', '流程实例的结果 - 通过', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1131, 3, '不通过', '3', 'bpm_process_instance_result', 0, 'danger', '', '流程实例的结果 - 不通过', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1132, 4, '已取消', '4', 'bpm_process_instance_result', 0, 'info', '', '流程实例的结果 - 撤销', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1133, 10, '流程表单', '10', 'bpm_model_form_type', 0, '', '', '流程的表单类型 - 流程表单', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1134, 20, '业务表单', '20', 'bpm_model_form_type', 0, '', '', '流程的表单类型 - 业务表单', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1135, 10, '角色', '10', 'bpm_task_assign_rule_type', 0, 'info', '', '任务分配规则的类型 - 角色', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1136, 20, '部门的成员', '20', 'bpm_task_assign_rule_type', 0, 'primary', '', '任务分配规则的类型 - 部门的成员', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1137, 21, '部门的负责人', '21', 'bpm_task_assign_rule_type', 0, 'primary', '', '任务分配规则的类型 - 部门的负责人', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1138, 30, '用户', '30', 'bpm_task_assign_rule_type', 0, 'info', '', '任务分配规则的类型 - 用户', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1139, 40, '用户组', '40', 'bpm_task_assign_rule_type', 0, 'warning', '', '任务分配规则的类型 - 用户组', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1140, 50, '自定义脚本', '50', 'bpm_task_assign_rule_type', 0, 'danger', '', '任务分配规则的类型 - 自定义脚本', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1141, 22, '岗位', '22', 'bpm_task_assign_rule_type', 0, 'success', '', '任务分配规则的类型 - 岗位', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1142, 10, '流程发起人', '10', 'bpm_task_assign_script', 0, '', '', '任务分配自定义脚本 - 流程发起人', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1143, 20, '流程发起人的一级领导', '20', 'bpm_task_assign_script', 0, '', '', '任务分配自定义脚本 - 流程发起人的一级领导', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1144, 21, '流程发起人的二级领导', '21', 'bpm_task_assign_script', 0, '', '', '任务分配自定义脚本 - 流程发起人的二级领导', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1145, 1, '管理后台', '1', 'infra_codegen_scene', 0, '', '', '代码生成的场景枚举 - 管理后台', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1146, 2, '用户 APP', '2', 'infra_codegen_scene', 0, '', '', '代码生成的场景枚举 - 用户 APP', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1147, 0, '未退款', '0', 'pay_refund_order_type', 0, 'info', '', '退款类型 - 未退款', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1148, 10, '部分退款', '10', 'pay_refund_order_type', 0, 'success', '', '退款类型 - 部分退款', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1149, 20, '全部退款', '20', 'pay_refund_order_type', 0, 'warning', '', '退款类型 - 全部退款', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1150, 1, '数据库', '1', 'infra_file_storage', 0, 'default', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1151, 10, '本地磁盘', '10', 'infra_file_storage', 0, 'default', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1152, 11, 'FTP 服务器', '11', 'infra_file_storage', 0, 'default', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1153, 12, 'SFTP 服务器', '12', 'infra_file_storage', 0, 'default', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1154, 20, 'S3 对象存储', '20', 'infra_file_storage', 0, 'default', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1155, 103, '短信登录', '103', 'system_login_type', 0, 'default', '', NULL, 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1156, 1, 'password', 'password', 'system_oauth2_grant_type', 0, 'default', '', '密码模式', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1157, 2, 'authorization_code', 'authorization_code', 'system_oauth2_grant_type', 0, 'primary', '', '授权码模式', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1158, 3, 'implicit', 'implicit', 'system_oauth2_grant_type', 0, 'success', '', '简化模式', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1159, 4, 'client_credentials', 'client_credentials', 'system_oauth2_grant_type', 0, 'default', '', '客户端模式', 0);
INSERT INTO "system_dict_data" ("id", "sort", "label", "value", "dict_type", "status", "color_type", "css_class",
                                "remark", "deleted")
VALUES (1160, 5, 'refresh_token', 'refresh_token', 'system_oauth2_grant_type', 0, 'info', '', '刷新模式', 0);
COMMIT;