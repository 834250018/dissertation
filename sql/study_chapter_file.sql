create table study_chapter_file
(
    id           bigint  not null
        constraint study_chapter_file_pkey
            primary key,

    chapter_id varchar not null,
    file_uri  varchar not null,

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
on table study_chapter_file is '章节文件表';
comment
on column study_chapter_file.id is '主键id';
comment
on column study_chapter_file.creator_id is '创建人id';
comment
on column study_chapter_file.updater_id is '修改人id';
comment
on column study_chapter_file.creator_name is '创建人名称';
comment
on column study_chapter_file.updater_name is '修改人名称';
comment
on column study_chapter_file.create_time is '创建时间';
comment
on column study_chapter_file.update_time is '修改时间';
comment
on column study_chapter_file.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column study_chapter_file.versions is '版本号';
comment
on column study_chapter_file.remark is '备注';

comment
on column study_chapter_file.chapter_id is '章节id';
comment
on column study_chapter_file.file_uri is '文件路径';

alter table study_chapter_file
    owner to test;

