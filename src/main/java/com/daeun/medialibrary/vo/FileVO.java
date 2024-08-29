package com.daeun.medialibrary.vo;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class FileVO {

    private int id;
    private String fileName;
    private String filePath;
    private Date createdDate;
    private String originalFileName;
}
