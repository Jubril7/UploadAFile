package com.uploadafile.uploads;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class Controller {

    public final Services services;

    @PostMapping("uploader")
    public ResponseEntity<String> uploadFile( MultipartFile file) {
        String fileName = String.valueOf(services.storeFile(file));
        return ResponseEntity.ok("File upload success");
    }
}


