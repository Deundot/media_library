package com.daeun.medialibrary.vo;

import lombok.Data;

@Data
public class BoardPagingVO {
    private int page;
    private int size;
    private String sort;
}
