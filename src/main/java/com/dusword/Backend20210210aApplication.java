package com.dusword;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.dusword.Mapper")
public class Backend20210210aApplication {

    public static void main(String[] args) {
        SpringApplication.run(Backend20210210aApplication.class, args);
    }

}
