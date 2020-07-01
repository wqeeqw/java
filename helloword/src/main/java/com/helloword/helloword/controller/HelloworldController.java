package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理请求
 */
@RestController  //@Controller+@ResponseBody
public class HelloworldController {
    @RequestMapping("/helloWorld")
    public String showHelloWorld() {
        return "HelloWorld";
    }
}
