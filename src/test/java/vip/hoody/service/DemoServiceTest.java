package vip.hoody.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import vip.hoody.config.InfoConfig;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {vip.hoody.config.MyConfiguration.class})
@TestPropertySource("classpath:test.properties")
public class DemoServiceTest {
    @Autowired
    DemoService demoService;

    @Autowired
    InfoConfig infoConfig;

    @Test
    public void getSystemTime() {
        System.out.println(demoService.getSystemTime());
    }
    @Test
    public void getInfo() {
        assertEquals(new Integer(100), demoService.age);
        assertEquals("OKname", demoService.name);
    }

    @Test
    public void getInfo2() {
        System.out.println(demoService.getInfo2());
        assertEquals(new Integer(100), infoConfig.getAge());
        assertEquals("OKname", infoConfig.getName());
    }
}
