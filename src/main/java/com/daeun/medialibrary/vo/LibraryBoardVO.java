package com.daeun.medialibrary.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LibraryBoardVO {
    private int id;
    private String title;
    private String content;
    private String writer;
    private int view_cnt;
    private boolean notice_yn;
    private boolean delete_yn;
    private LocalDateTime created_date;
    private LocalDateTime modified_date;
}
