package com.itheima.springboottest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTestApplicationTests {

    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
    }

    @Test
    public void add(){
        userService.add();
    }

}
