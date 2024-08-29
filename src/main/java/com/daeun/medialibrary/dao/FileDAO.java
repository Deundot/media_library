package com.daeun.medialibrary.dao;

import com.daeun.medialibrary.vo.FileVO;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDAO {

    void insertFile(FileVO vo);
}
