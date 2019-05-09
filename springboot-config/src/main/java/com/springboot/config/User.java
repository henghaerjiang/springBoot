package com.springboot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName User
 * @Description TODO
 * @Author 溦林昔
 * @Date 2019/5/9.
 */
@Configuration
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.forezp")
@Setter
@Getter
public class User {
    private String name;
    private int age;
}
