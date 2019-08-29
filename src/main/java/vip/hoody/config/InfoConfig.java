package vip.hoody.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(
        prefix = "vip.hoody"
)
@Component
public class InfoConfig {

    /**
     * 使用者用户名
     */
    private String name = "hoody";
    /**
     * 使用者年龄
     */
    private Integer age = 18;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
