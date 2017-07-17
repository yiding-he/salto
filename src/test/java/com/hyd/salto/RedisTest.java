package com.hyd.salto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String, String> stringRedisTemplate;

    @Test
    public void testRedisBasic() throws Exception {
        assertNotNull(stringRedisTemplate);

        ValueOperations<String, String> kvOps = stringRedisTemplate.opsForValue();
        kvOps.set("name", "salto");
        assertEquals("salto", kvOps.get("name"));
    }
}
