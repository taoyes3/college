package com.taoyes3.eduservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.taoyes3.eduservice.mapper"})
public class EduConfig {
}
