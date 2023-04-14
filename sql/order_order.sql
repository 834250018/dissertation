create table order_order
(
    id           bigint not null
        constraint order_order_pkey
            primary key,

    order_title      varchar not null,
    order_amt      decimal(12,2) not null,
    order_no      varchar not null,
    third_party_no      varchar not null,
    order_status      int not null,
    pay_way      int not null,
    pay_time      bigint not null,
    user_id      bigint not null,

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
on table order_order is '订单表';
comment
on column order_order.id is '主键id';
comment
on column order_order.creator_id is '创建人id';
comment
on column order_order.updater_id is '修改人id';
comment
on column order_order.creator_name is '创建人名称';
comment
on column order_order.updater_name is '修改人名称';
comment
on column order_order.create_time is '创建时间';
comment
on column order_order.update_time is '修改时间';
comment
on column order_order.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column order_order.versions is '版本号';
comment
on column order_order.remark is '备注';

comment
on column order_order.order_title is '订单标题';
comment
on column order_order.order_amt is '订单总金额';
comment
on column order_order.order_no is '订单号';
comment
on column order_order.third_party_no is '第三方流水号';
comment
on column order_order.order_status is '订单状态';
comment
on column order_order.pay_way is '支付方式';
comment
on column order_order.pay_time is '支付时间';
comment
on column order_order.user_id is '用户id';

alter table order_order
    owner to test;

