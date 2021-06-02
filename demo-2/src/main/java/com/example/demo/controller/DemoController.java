package com.example.demo.controller;

import com.example.demo.dto.HelloDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.time.Instant;
import java.sql.Timestamp;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DemoController {
	@GetMapping(value = "/hello")
    public HelloDto getHello() {
		Date date = new Date();
		Instant instant = Instant.now();
		Timestamp time = new Timestamp(date.getTime());
		System.out.println(date.getTime());
        return new HelloDto("Hello! This is from Spring Boot RESTful API!", 2021, date.getTime()); // <--這邊的字串最後會顯示在前端頁面
    }
}
