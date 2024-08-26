package com.daeun.medialibrary.controller;

import com.daeun.medialibrary.service.LibraryBoardService;
import com.daeun.medialibrary.vo.LibraryBoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/library", method = RequestMethod.GET)
public class LibraryController {

    @Autowired
    private final LibraryBoardService libraryBoardService;

    //list
    @GetMapping("/list")
    public ResponseEntity<List<LibraryBoardVO>> boardList() {
        List<LibraryBoardVO> allBoardList = libraryBoardService.getList();
        return ResponseEntity.status(HttpStatus.OK).body(allBoardList);
    }

    //write(글 등록)

    //이미지 클릭하면 상세로 넘어가기
    //detail


}
