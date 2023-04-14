create table message_user_message
(
    id           bigint not null
        constraint message_user_message_pkey
            primary key,

    from_id      bigint,
    target_id        bigint,
    content      varchar,
    message_read      smallint ,

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
comment on table message_user_message is '用户私信表';
comment on column message_user_message.id is '主键id';
comment on column message_user_message.creator_id is '创建人id';
comment on column message_user_message.updater_id is '修改人id';
comment on column message_user_message.create_time is '创建时间';
comment on column message_user_message.update_time is '修改时间';
comment on column message_user_message.creator_name is '创建人名称';
comment on column message_user_message.updater_name is '修改人名称';
comment on column message_user_message.deleted is '是否被删除:0.未删除;1.已删除';
comment on column message_user_message.versions is '版本号';
comment on column message_user_message.remark is '备注';

comment on column message_user_message.from_id is '发送人id';
comment on column message_user_message.target_id is '接收人id';
comment on column message_user_message.content is '消息内容';
comment on column message_user_message.message_read is '是否已读:0未读,1已读';

alter table message_user_message
    owner to test;

