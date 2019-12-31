package com.kingmao.library;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kingmao.library.dao")
public class LibraryApplication {
    private static final Logger logger = LoggerFactory.getLogger(LibraryApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
        logger.info("项目启动成功！");
    }
}
