create table study_video
(
    id           bigint  not null
        constraint study_video_pkey
            primary key,

    ali_video_id varchar not null,
    video_cover  varchar not null,
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
on table study_video is '课程表';
comment
on column study_video.id is '主键id';
comment
on column study_video.creator_id is '创建人id';
comment
on column study_video.updater_id is '修改人id';
comment
on column study_video.creator_name is '创建人名称';
comment
on column study_video.updater_name is '修改人名称';
comment
on column study_video.create_time is '创建时间';
comment
on column study_video.update_time is '修改时间';
comment
on column study_video.deleted is '是否被删除:0.未删除;1.已删除';
comment
on column study_video.versions is '版本号';
comment
on column study_video.remark is '备注';

comment
on column study_video.ali_video_id is '阿里云视频id';
comment
on column study_video.video_cover is '视频封面';
comment
on column study_video.user_id is '上传视频的用户id';

alter table study_video
    owner to test;

