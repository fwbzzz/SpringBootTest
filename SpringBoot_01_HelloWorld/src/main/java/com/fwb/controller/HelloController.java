package com.fwb.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fengweibo
 * @version 1.0
 * @date 2021/4/22 12:22
 */

//@ResponseBody   @Controller 合并成  @RestController
@RestController
public class HelloController {


    //接收来自于浏览器的hello请求
    @RequestMapping("/hello")
    //将返回的"Hello, Spring Boot 2!"写给浏览器，如果每个方法都写太麻烦了，可以将他写到类的最上面
    @ResponseBody
    public String handle01(){
        return "Hello, Spring Boot 2!";
    }


}