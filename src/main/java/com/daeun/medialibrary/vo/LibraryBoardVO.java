package com.daeun.medialibrary.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LibraryBoardVO {
    private int id;
    private String title;
    private String content;
    private String writer;
    private int viewCnt;
    private boolean noticeYn;
    private boolean deleteYn;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
}
