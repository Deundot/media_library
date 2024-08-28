package com.daeun.medialibrary;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class MedialibraryApplication {

	@Value("${file.upload.path}")
	private String uploadDirectory;

	public static void main(String[] args) {
		SpringApplication.run(MedialibraryApplication.class, args);
	}

	@PostConstruct
	public void init() {
		File directory = new File(uploadDirectory);
		if (!directory.exists()) {
			directory.mkdirs(); // 디렉터리 생성
		}
	}
}
