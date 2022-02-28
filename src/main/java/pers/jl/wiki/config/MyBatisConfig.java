package pers.jl.wiki.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * @author: JL Du
 * @date: 2022/2/28 20:10
 * @version: 1.0.0
 */
@Configuration
@MapperScan({"pers.jl.wiki.mbg.mapper","pers.jl.wiki.mapper"})
public class MyBatisConfig {
}

