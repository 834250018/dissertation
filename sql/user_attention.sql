create table user_attention
(
    id           bigint not null
        constraint user_attention_pkey
            primary key,

    follower_id      bigint not null,
    target_id      bigint not null,
    mutual      smallint not null,

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

comment
on table user_attention is '用户关注表';
comment
on column user_attention.id is '主键id';
comment
on column user_attention.creator_id is '创建人id';
comment
on column user_attention.updater_id is '修改人id';
comment
on column user_attention.creator_name is '创建人名称';
comment
on column user_attention.updater_name is '修改人名称';
comment
on column user_attention.create_time is '创建时间';
comment
on column user_attention.update_time is '修改时间';
comment
on column user_attention.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column user_attention.versions is '版本号';
comment
on column user_attention.remark is '备注';

comment
on column user_attention.follower_id is '关注人id';
comment
on column user_attention.target_id is '受关注人id';
comment
on column user_attention.mutual is '是否互相关注:0未互相关注,1互相关注';

alter table user_attention
    owner to test;

