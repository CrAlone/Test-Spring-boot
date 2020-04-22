package com.duyi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 使用自己的一个类对应的配置文件 prefix代表配置文件的前缀
 * @ConfigurationProperties
 */
@ConfigurationProperties(prefix = "food")

public class FoodConfig {
    //烤肉拌饭
    private String barbecue;
    private String rice;
    public String getBarbecue() {
        return barbecue;
    }
    public void setBarbecue(String barbecue) {
        this.barbecue = barbecue;
    }
    public String getRice() {
        return rice;
    }
    public void setRice(String rice) {
        this.rice = rice;
    }
}
