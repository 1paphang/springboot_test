package com.paphang.helloworld_maven.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@RestController
public class FileUploadController {

    @PostMapping("/upload")
    public String up(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException{
        System.out.println(nickname);
        System.out.println(photo.getOriginalFilename());
        System.out.println(photo.getContentType());
        System.out.println(System.getProperty("user.dir"));

        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(photo,path);
        return "上传成功";
    }
    public void saveFile(MultipartFile photo, String path) throws IOException{
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }
        File file = new File(path + photo.getOriginalFilename());
        photo.transferTo(file);
    }

}
