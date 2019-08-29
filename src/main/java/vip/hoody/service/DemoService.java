package vip.hoody.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import vip.hoody.config.InfoConfig;

import java.util.Date;

@Service
public class DemoService {

    public String getSystemTime() {
        return "来自Starter的信息:" + new Date().toString();
    }

    @Value("${vip.hoody.age}")
    Integer age;

    @Value("${vip.hoody.name}")
    String name;

    public String getInfo() {
        return "来自Starter的信息,name:" + name + " age:" + age;
    }

    @Autowired
    InfoConfig infoConfig;

    public String getInfo2() {
        return "来自Starter的信息,name:" + infoConfig.getName() + " age:" + infoConfig.getAge();
    }

}
