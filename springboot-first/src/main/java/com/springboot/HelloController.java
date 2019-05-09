package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 溦林昔
 * @Date 2019/5/9.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return  "nosql";
    }
}
