package com.xhlx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xhlx
 * @date 2019/11/4 11:05
 * @description
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hi")
    public String hi() {
        return "I'm lay";
    }
}
