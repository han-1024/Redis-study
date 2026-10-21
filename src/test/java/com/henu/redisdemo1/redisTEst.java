package com.henu.redisdemo1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
public class redisTEst {
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Test
    public void teststring(){
        redisTemplate.opsForValue().set("name","hello");
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println(name);
    }
}
