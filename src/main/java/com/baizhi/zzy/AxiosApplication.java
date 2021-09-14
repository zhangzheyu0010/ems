package com.baizhi.zzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@MapperScan("com.baizhi.zzy.dao")
public class AxiosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AxiosApplication.class, args);
    }

}
