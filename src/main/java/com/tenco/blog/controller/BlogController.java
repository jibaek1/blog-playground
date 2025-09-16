package com.tenco.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    private static final Logger log = LoggerFactory.getLogger(BlogController.class);

    @GetMapping("/blog")
    public String getBlog() {
        log.debug("메서드 시작");
        log.info("블로그 조회 요청");
        log.debug("데이터베이스 연결");
        log.error("에러 발생");
        return "블로그 데이터";
    }
}
