create table user_user
(
    id            bigint                                   not null
        constraint user_user_pkey
            primary key,

    phone         varchar                                  not null,
    head_portrait varchar                                  not null,
    gender        int                                      not null,
    province_code varchar                                  not null,
    city_code     varchar                                  not null,
    area_code     varchar                                  not null,
    province_name varchar                                  not null,
    city_name     varchar                                  not null,
    area_name     varchar                                  not null,
    address       varchar                                  not null,
    birthday      bigint                                   not null,
    occupation    varchar                                  not null,
    nickname      varchar                                  not null,
    nation        varchar  default '汉族'::character varying not null,
    hometown      varchar                                  not null,
    age           int                                      not null,

    creator_id    bigint,
    updater_id    bigint,
    creator_name  varchar,
    updater_name  varchar,
    create_time   bigint,
    update_time   bigint,
    deleted       smallint default 0,
    versions      int,
    remark        varchar
);

comment on table user_user is '用户表';
comment on column user_user.id is '主键id';
comment on column user_user.creator_id is '创建人id';
comment on column user_user.updater_id is '修改人id';
comment on column user_user.creator_name is '创建人名称';
comment on column user_user.updater_name is '修改人名称';
comment on column user_user.create_time is '创建时间';
comment on column user_user.update_time is '修改时间';
comment on column user_user.deleted is '是否被删除:0.未删除;1.已删除';
comment on column user_user.versions is '版本号';
comment on column user_user.remark is '备注';

comment on column user_user.phone is '手机号码';

alter table user_user
    owner to test;
