create table user_user_role_rel
(
    id           bigint not null
        constraint user_user_role_rel_pkey
            primary key,

    user_id      bigint not null,
    role_id      bigint not null,

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
on table user_user_role_rel is '用户表';
comment
on column user_user_role_rel.id is '主键id';
comment
on column user_user_role_rel.creator_id is '创建人id';
comment
on column user_user_role_rel.updater_id is '修改人id';
comment
on column user_user_role_rel.creator_name is '创建人名称';
comment
on column user_user_role_rel.updater_name is '修改人名称';
comment
on column user_user_role_rel.create_time is '创建时间';
comment
on column user_user_role_rel.update_time is '修改时间';
comment
on column user_user_role_rel.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column user_user_role_rel.versions is '版本号';
comment
on column user_user_role_rel.remark is '备注';

comment
on column user_user_role_rel.user_id is '用户id';
comment
on column user_user_role_rel.role_id is '角色id';

alter table user_user_role_rel
    owner to test;

