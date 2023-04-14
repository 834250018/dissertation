create table order_order_detail
(
    id           bigint not null
        constraint order_order_detail_pkey
            primary key,

    order_id      bigint not null,
    course_id      bigint not null,
    course_amt      decimal(12,2) not null,
    pay_amt      decimal(12,2) not null,

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
on table order_order_detail is '订单明细表';
comment
on column order_order_detail.id is '主键id';
comment
on column order_order_detail.creator_id is '创建人id';
comment
on column order_order_detail.updater_id is '修改人id';
comment
on column order_order_detail.creator_name is '创建人名称';
comment
on column order_order_detail.updater_name is '修改人名称';
comment
on column order_order_detail.create_time is '创建时间';
comment
on column order_order_detail.update_time is '修改时间';
comment
on column order_order_detail.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column order_order_detail.versions is '版本号';
comment
on column order_order_detail.remark is '备注';

comment
on column order_order_detail.order_id is '订单id';
comment
on column order_order_detail.course_id is '课程id';
comment
on column order_order_detail.course_amt is '课程原价';
comment
on column order_order_detail.pay_amt is '课程现价';

alter table order_order_detail
    owner to test;

