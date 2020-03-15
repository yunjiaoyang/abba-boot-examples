package com.abba.boot.example.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * TODO
 *
 * @author Lucky.Yang
 * @create 2020/3/15
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
public class SimpleApplicationTests {
    @Autowired
    private SimpleService simpleService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void serviceLoads() {
        assertNotNull(this.simpleService);
    }

}
