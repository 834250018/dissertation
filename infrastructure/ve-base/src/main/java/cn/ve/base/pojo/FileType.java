/**
 *
 */
package cn.ve.base.pojo;

import java.io.Serializable;

public enum FileType implements Serializable {

    JPG(".jpg", "image/jpeg"),
    GIF(".gif", "image/gif"),
    PNG(".png", "image/png"),
    BMP(".bmp", "image/bmp"),
    TXT(".txt",
        "text/plain"),
    ZIP(".zip", "application/zip"),
    MP3(".mp3", "audio/mpeg3"),
    AVI(".avi", "video/avi"),
    AMR(".amr",
        "audio/amr"),
    WAV(".wav", "audio/wav"),
    GZIP(".gzip", "application/x-gzip"),
    GZ(".gz",
        "application/x-gzip"),
    STREAM("", "application/octet-stream"),
    JS(".js", "text/plain"),
    HTML(".html",
        "text/html"),
    HEX(".hex", "application/octet-stream"),
    PDF(".pdf", "application/octet-stream"),
    LSF(".lsf",
        "application/octet-stream"),
    ELF(".elf", "application/octet-stream"),
    BIN(".bin",
        "application/octet-stream"),
    APK(".apk", "application/octet-stream"),
    XLS(".xls",
        "application/vnd.ms-excel"),
    XLSX(".xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),

    ;

    private final String suffix;
    private final String mimeType;

    private FileType(String suffix, String mimeType) {
        this.suffix = suffix;
        this.mimeType = mimeType;
    }

    public static FileType valueOf2(String name) {
        FileType fs = null;
        try {
            fs = FileType.valueOf(name.toUpperCase());
        } catch (Exception e) {
        }

        if (fs == null)
            throw new VeBaseException("100011", name);
        return fs;
    }

    /**
     * 获取文件的真实后缀名。目前只支持JPG, GIF, PNG, BMP四种图片文件。
     *
     * @param bytes
     *            文件字节流
     * @return JPG, GIF, PNG or null
     */
    public static FileType getFileSuffix(byte[] bytes) {
        if (bytes == null || bytes.length < 10) {
            return null;
        }

        if (bytes[0] == 'G' && bytes[1] == 'I' && bytes[2] == 'F') {
            return FileType.GIF;
        } else if (bytes[1] == 'P' && bytes[2] == 'N' && bytes[3] == 'G') {
            return FileType.PNG;
        } else if (bytes[6] == 'J' && bytes[7] == 'F' && bytes[8] == 'I' && bytes[9] == 'F') {
            return FileType.JPG;
        } else if (bytes[0] == 'B' && bytes[1] == 'M') {
            return FileType.BMP;
        } else {
            return null;
        }
    }

    public String getMimeType() {
        return mimeType;
    }

    public String getSuffix() {
        return suffix;
    }
}
