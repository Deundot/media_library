package com.daeun.medialibrary.service;

import com.daeun.medialibrary.dao.FileDAO;
import com.daeun.medialibrary.vo.FileVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.FileInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FileService {

    @Value("${file.upload.path}")
    private String FILE_UPLOAD_PATH;

    private final FileDAO fileDAO;

    public String saveFile(MultipartFile file) throws IOException {
        String originalFileName = file.getOriginalFilename();
        String filePath = FILE_UPLOAD_PATH + File.separator + originalFileName;

        // Save the file to the server
        Files.copy(file.getInputStream(), Paths.get(filePath));

        // Save file info to database
        FileVO fileVO = new FileVO();
        fileVO.setFileName(originalFileName);
        fileVO.setFilePath(filePath);
        fileVO.setCreatedDate(new Date()); // Set the current date and time
        fileVO.setOriginalFileName(originalFileName);
        fileDAO.insertFile(fileVO);

        // Return the file path or URL
        return filePath;
    }
}
