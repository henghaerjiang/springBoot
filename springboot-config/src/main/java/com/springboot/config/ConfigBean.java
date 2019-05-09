package com.springboot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName ConfigBean
 * @Description TODO
 * @Author 溦林昔
 * @Date 2019/5/9.
 */
@ConfigurationProperties(prefix = "my")
@Component
@Setter
@Getter
public class ConfigBean {
    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private  String value;
    private String greeting;
}
