package com.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName configController
 * @Description TODO
 * @Author 溦林昔
 * @Date 2019/5/9.
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class,User.class})
public class ConfigController {

    @Autowired
    ConfigBean configBean;

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping(value = "/miya")
    public String miya(){
        return name + ":" + age;
    }

    @RequestMapping(value = "/lucy")
    public String lucy(){
        return configBean.getGreeting()+" >>>>"+configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+configBean.getMax();
    }

    @Autowired
    User user;
    @RequestMapping(value = "/user")
    public String user(){
        return user.getName() + user.getAge();
    }

}
