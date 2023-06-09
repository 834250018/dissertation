create table user_login_relation
(
    id           bigint not null
        constraint user_login_relation_pkey
            primary key,

    user_id      bigint,
    user_type    int,
    login_type   int,
    username     varchar,
    password     varchar,
    salt         varchar,

    creator_id   bigint,
    updater_id   bigint,
    creator_name varchar,
    updater_name varchar,
    create_time  bigint,
    update_time  bigint,
    deleted      smallint default 0,
    versions     int,
    remark       varchar
);
comment on table user_login_relation is '用户登录关系表';
comment on column user_login_relation.id is '主键id';
comment on column user_login_relation.creator_id is '创建人id';
comment on column user_login_relation.updater_id is '修改人id';
comment on column user_login_relation.create_time is '创建时间';
comment on column user_login_relation.update_time is '修改时间';
comment on column user_login_relation.creator_name is '创建人名称';
comment on column user_login_relation.updater_name is '修改人名称';
comment on column user_login_relation.deleted is '是否被删除:0.未删除;1.已删除';
comment on column user_login_relation.versions is '版本号';
comment on column user_login_relation.remark is '备注';

comment on column user_login_relation.user_id is '用户id';
comment on column user_login_relation.login_type is '登录类型:0->微信登陆;1->手机号登录;2->账号密码登录;';
comment on column user_login_relation.username is '账号或手机号或第三方openid';
comment on column user_login_relation.password is '密码';
comment on column user_login_relation.salt is '盐';

alter table user_login_relation
    owner to test;

