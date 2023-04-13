create table system_role
(
    id           bigint   not null
        constraint system_role_pkey
            primary key,

    role_title   varchar  not null,
    role_string  varchar  not null,
    role_order   int      not null,
    enable       smallint not null,

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
on column system_role.role_title is '角色名称';
comment
on column system_role.role_string is '角色权限字符串';
comment
on column system_role.role_order is '角色排序';
comment
on column system_role.enable is '启用状态:0未启用,1已启用';

alter table system_role
    owner to test;

