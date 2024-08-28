package com.daeun.medialibrary.service;

import com.daeun.medialibrary.dao.LibraryBoardDAO;
import com.daeun.medialibrary.vo.LibraryBoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibraryBoardService {

    private final LibraryBoardDAO libraryBoardDAO;

    @Transactional(readOnly = true)
    public List<LibraryBoardVO> getList() {
        return libraryBoardDAO.selectListPost();
    }

    @Transactional(readOnly = true)
    public LibraryBoardVO getListID(int id) {
        return libraryBoardDAO.selectListPostID(id);
    }

    @Transactional
    public Integer addPost(LibraryBoardVO vo) {
        return libraryBoardDAO.insertPost(vo);
    }


}
