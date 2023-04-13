create table study_course_record
(
    id              bigint  not null
        constraint study_course_record_pkey
            primary key,

    user_id         bigint  not null,
    course_id       bigint  not null,
    course_progress decimal(5,2) not null,

    creator_id      bigint,
    updater_id      bigint,
    creator_name    varchar,
    updater_name    varchar,
    create_time     bigint,
    update_time     bigint,
    deleted         smallint default 0,
    versions        int,
    remark          varchar
);

comment
on table study_course_record is '用户表';
comment
on column study_course_record.id is '主键id';
comment
on column study_course_record.creator_id is '创建人id';
comment
on column study_course_record.updater_id is '修改人id';
comment
on column study_course_record.creator_name is '创建人名称';
comment
on column study_course_record.updater_name is '修改人名称';
comment
on column study_course_record.create_time is '创建时间';
comment
on column study_course_record.update_time is '修改时间';
comment
on column study_course_record.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column study_course_record.versions is '版本号';
comment
on column study_course_record.remark is '备注';

comment
on column study_course_record.user_id is '用户id';
comment
on column study_course_record.course_id is '课程id';
comment
on column study_course_record.course_progress is '课程进度';

alter table study_course_record
    owner to test;

