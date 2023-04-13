create table system_role
(
    id                 bigint   not null
        constraint system_role_pkey
            primary key,

    course_id          bigint   not null,
    user_id            bigint   not null,
    user_head_portrait varchar  not null,
    user_name          varchar  not null,
    review_context     varchar  not null,
    review_type        smallint not null,

    creator_id         bigint,
    updater_id         bigint,
    creator_name       varchar,
    updater_name       varchar,
    create_time        bigint,
    update_time        bigint,
    deleted            smallint default 0,
    versions           int,
    remark             varchar
);

comment
on table system_role is '课程表';
comment
on column system_role.id is '主键id';
comment
on column system_role.creator_id is '创建人id';
comment
on column system_role.updater_id is '修改人id';
comment
on column system_role.creator_name is '创建人名称';
comment
on column system_role.updater_name is '修改人名称';
comment
on column system_role.create_time is '创建时间';
comment
on column system_role.update_time is '修改时间';
comment
on column system_role.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column system_role.versions is '版本号';
comment
on column system_role.remark is '备注';

comment
on column system_role.course_id is '课程id';
comment
on column system_role.user_id is '用户id';
comment
on column system_role.user_head_portrait is '用户头像';
comment
on column system_role.user_name is '用户名称';
comment
on column system_role.review_context is '评价内容';
comment
on column system_role.review_type is '评价类型:0好评,1差评';

alter table system_role
    owner to test;

