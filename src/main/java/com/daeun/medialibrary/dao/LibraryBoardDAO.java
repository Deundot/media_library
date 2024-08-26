package com.daeun.medialibrary.dao;

import com.daeun.medialibrary.vo.LibraryBoardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryBoardDAO {

    List<LibraryBoardVO> selectListPost();
}
