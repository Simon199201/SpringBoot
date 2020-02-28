package com.itheima.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void RedisSet() {
        redisTemplate.boundValueOps("name").set("zhang san");
    }

    @Test
    public void RedisGet() {
        System.out.println(redisTemplate.boundValueOps("name").get());
    }
}


