package com.daeun.medialibrary.service;

import com.daeun.medialibrary.dao.LibraryBoardDAO;
import com.daeun.medialibrary.vo.BoardPagingVO;
import com.daeun.medialibrary.vo.LibraryBoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
