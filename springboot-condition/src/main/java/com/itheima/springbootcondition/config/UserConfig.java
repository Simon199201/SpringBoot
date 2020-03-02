package com.itheima.springbootcondition.config;

import com.itheima.springbootcondition.condition.ClassCondition;
import com.itheima.springbootcondition.condition.ConditionOnClass;
import com.itheima.springbootcondition.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
//    @Conditional(ClassCondition.class)
    @ConditionOnClass("org.springframework.data.redis.core.RedisTemplate")
    public User user(){
        return new User();
    }
}
