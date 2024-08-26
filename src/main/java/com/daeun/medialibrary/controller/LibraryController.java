package com.daeun.medialibrary.controller;

import com.daeun.medialibrary.service.LibraryBoardService;
import com.daeun.medialibrary.vo.LibraryBoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    //이미지 상세

}
