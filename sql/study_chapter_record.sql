create table study_chapter_record
(
    id            bigint                                   not null
        constraint study_chapter_record_pkey
            primary key,

    user_id         bigint                                  not null,
    course_id bigint                                  not null,
    chapter_id        bigint                                      not null,
    chapter_progress decimal(5,2)                                  not null,
    chapter_type     int                                  not null,
    video_progress     decimal(5,2)                                  not null,
    file_download smallint                                  not null,

    creator_id    bigint,
    updater_id    bigint,
    creator_name  varchar,
    updater_name  varchar,
    create_time   bigint,
    update_time   bigint,
    deleted       smallint default 0,
    versions      int,
    remark        varchar
);

comment on table study_chapter_record is '用户表';
comment on column study_chapter_record.id is '主键id';
comment on column study_chapter_record.creator_id is '创建人id';
comment on column study_chapter_record.updater_id is '修改人id';
comment on column study_chapter_record.creator_name is '创建人名称';
comment on column study_chapter_record.updater_name is '修改人名称';
comment on column study_chapter_record.create_time is '创建时间';
comment on column study_chapter_record.update_time is '修改时间';
comment on column study_chapter_record.deleted is '是否被删除:0.未删除;1.已删除';
comment on column study_chapter_record.versions is '版本号';
comment on column study_chapter_record.remark is '备注';

comment on column study_chapter_record.user_id is '用户id';
comment on column study_chapter_record.course_id is '课程id';
comment on column study_chapter_record.chapter_id is '章节id';
comment on column study_chapter_record.chapter_progress is '章节进度';
comment on column study_chapter_record.chapter_type is '章节类型:0纯文本,1含视频,2含文件';
comment on column study_chapter_record.video_progress is '视频进度';
comment on column study_chapter_record.file_download is '文件是否下载:0未下载,1已下载';

alter table study_chapter_record
    owner to test;

