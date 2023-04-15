create table system_role_menu_rel
(
    id                 bigint   not null
        constraint system_role_menu_rel_pkey
            primary key,

    role_id            bigint   not null,
    menu_id            bigint   not null,

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
on column system_role_menu_rel.role_id is '角色id';
comment
on column system_role_menu_rel.menu_id is '菜单id';

alter table system_role_menu_rel
    owner to test;

