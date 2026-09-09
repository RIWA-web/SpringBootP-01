package com.SpringBootP03.Controller;

import com.SpringBootP03.dto.StudentRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentPost {
    @PostMapping("/create")
    public String createstudent(@RequestBody StudentRequest request){

        return "Student created:"+request.getName();
    }
}
