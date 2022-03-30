package me.star.springboot_nacos.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周思达
 * @create 2022/3/22 10:15
 */

@RestController
@RequestMapping("/provider")
@RefreshScope
public class Provider {

    @GetMapping("/helloProvider")
    public String helloProvider(){
        return "hello";
    }
}