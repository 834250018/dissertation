create table system_menu
(
    id             bigint   not null
        constraint system_menu_pkey
            primary key,

    menu_title     varchar   not null,
    menu_string    varchar   not null,
    menu_type      smallint  not null,
    menu_order     int  not null,
    parent_id      bigint  not null,
    route_uri      varchar not null,
    menu_icon      varchar not null,
    component_uri  varchar not null,
    menu_status    smallint not null,
    menu_hiding    smallint not null,
    menu_temporary smallint not null,

    creator_id     bigint,
    updater_id     bigint,
    creator_name   varchar,
    updater_name   varchar,
    create_time    bigint,
    update_time    bigint,
    deleted        smallint default 0,
    versions       int,
    remark         varchar
);

comment
on table system_menu is '课程表';
comment
on column system_menu.id is '主键id';
comment
on column system_menu.creator_id is '创建人id';
comment
on column system_menu.updater_id is '修改人id';
comment
on column system_menu.creator_name is '创建人名称';
comment
on column system_menu.updater_name is '修改人名称';
comment
on column system_menu.create_time is '创建时间';
comment
on column system_menu.update_time is '修改时间';
comment
on column system_menu.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column system_menu.versions is '版本号';
comment
on column system_menu.remark is '备注';

comment
on column system_menu.menu_title is '菜单名称';
comment
on column system_menu.menu_string is '菜单标识';
comment
on column system_menu.menu_type is '菜单类型';
comment
on column system_menu.menu_order is '菜单排序';
comment
on column system_menu.parent_id is '父菜单id';
comment
on column system_menu.route_uri is '路由地址';
comment
on column system_menu.menu_icon is '菜单图标';
comment
on column system_menu.component_uri is '组件路径';
comment
on column system_menu.menu_status is '菜单状态';
comment
on column system_menu.menu_hiding is '是否可见:0可见,1隐藏';
comment
on column system_menu.menu_temporary is '是否缓存:0不缓存,1缓存';

alter table system_menu
    owner to test;

