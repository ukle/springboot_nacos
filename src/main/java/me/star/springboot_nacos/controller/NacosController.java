package me.star.springboot_nacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Star Chou
 * @description /
 * @create 2022/3/4
 */
@RestController
public class NacosController {

//    @Value(value = "${aa}")
//    private String aa;
//
//    @GetMapping(value = "aa")
//    public String aa() {
//        return aa;
//    }

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping(value = "redis")
    public String set() {
        String key = "12";
        String value = "123";
        redisTemplate.opsForValue().set(key,value);
        return "";
    }
}
