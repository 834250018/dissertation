create table system_role_menu_rel
(
    id                 bigint   not null
        constraint system_role_menu_rel_pkey
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
on table system_role_menu_rel is '课程表';
comment
on column system_role_menu_rel.id is '主键id';
comment
on column system_role_menu_rel.creator_id is '创建人id';
comment
on column system_role_menu_rel.updater_id is '修改人id';
comment
on column system_role_menu_rel.creator_name is '创建人名称';
comment
on column system_role_menu_rel.updater_name is '修改人名称';
comment
on column system_role_menu_rel.create_time is '创建时间';
comment
on column system_role_menu_rel.update_time is '修改时间';
comment
on column system_role_menu_rel.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column system_role_menu_rel.versions is '版本号';
comment
on column system_role_menu_rel.remark is '备注';

comment
on column system_role_menu_rel.course_id is '课程id';
comment
on column system_role_menu_rel.user_id is '用户id';
comment
on column system_role_menu_rel.user_head_portrait is '用户头像';
comment
on column system_role_menu_rel.user_name is '用户名称';
comment
on column system_role_menu_rel.review_context is '评价内容';
comment
on column system_role_menu_rel.review_type is '评价类型:0好评,1差评';

alter table system_role_menu_rel
    owner to test;

