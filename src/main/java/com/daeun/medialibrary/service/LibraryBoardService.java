package com.daeun.medialibrary.service;

import com.daeun.medialibrary.dao.LibraryBoardDAO;
import com.daeun.medialibrary.vo.LibraryBoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibraryBoardService {

    private final LibraryBoardDAO libraryBoardDAO;

    public List<LibraryBoardVO> getList() {
        return libraryBoardDAO.selectListPost();
    }
}
