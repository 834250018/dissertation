create table study_chapter
(
    id           bigint  not null
        constraint study_chapter_pkey
            primary key,

    title        varchar not null,
    description  varchar not null,
    context      varchar not null,
    chapter_type int     not null,
    rel_id       bigint  not null,
    course_id    bigint  not null,
    parent_id    bigint  not null,

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
on table study_chapter is '用户表';
comment
on column study_chapter.id is '主键id';
comment
on column study_chapter.creator_id is '创建人id';
comment
on column study_chapter.updater_id is '修改人id';
comment
on column study_chapter.creator_name is '创建人名称';
comment
on column study_chapter.updater_name is '修改人名称';
comment
on column study_chapter.create_time is '创建时间';
comment
on column study_chapter.update_time is '修改时间';
comment
on column study_chapter.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column study_chapter.versions is '版本号';
comment
on column study_chapter.remark is '备注';

comment
on column study_chapter.title is '章节标题';
comment
on column study_chapter.description is '章节描述';
comment
on column study_chapter.context is '章节内容';
comment
on column study_chapter.chapter_type is '章节类型:0纯文本,1含视频,2含文件';
comment
on column study_chapter.rel_id is '关联文件或视频id';
comment
on column study_chapter.course_id is '课程id';
comment
on column study_chapter.parent_id is '父章节id';

alter table study_chapter
    owner to test;

