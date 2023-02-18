package com.hth;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class BlogTest {
    @Autowired
    StringRedisTemplate redisTemplate;
    @Test
    public void testRedisConnect(){
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        opsForValue.set("name", "lisi"); // 缓存数据
        String value = opsForValue.get("name"); // 获取缓存数据
        System.out.println(value);
    }
}
