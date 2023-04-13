create table study_course
(
    id           bigint  not null
        constraint study_course_pkey
            primary key,

    course_title varchar not null,
    description  varchar not null,
    user_name    varchar not null,
    user_id      bigint  not null,

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
on table study_course is '课程表';
comment
on column study_course.id is '主键id';
comment
on column study_course.creator_id is '创建人id';
comment
on column study_course.updater_id is '修改人id';
comment
on column study_course.creator_name is '创建人名称';
comment
on column study_course.updater_name is '修改人名称';
comment
on column study_course.create_time is '创建时间';
comment
on column study_course.update_time is '修改时间';
comment
on column study_course.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column study_course.versions is '版本号';
comment
on column study_course.remark is '备注';

comment on column study_course.course_title is '课程标题';
comment on column study_course.description is '课程描述';
comment on column study_course.user_name is '课程所属用户名称';
comment on column study_course.user_id is '课程所属用户id';

alter table study_course
    owner to test;

