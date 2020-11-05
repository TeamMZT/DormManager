package com.example.dorm;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 夜未央、乐未殇
 */
@MapperScan(basePackages = "com.example.dorm.mapper")
@SpringBootApplication
public class DormApplication {
    public static void main(String[] args) {
        SpringApplication.run(DormApplication.class, args);
    }
}
