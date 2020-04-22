package com.duyi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Configuration声明这是一个配置类 在spring中可以代替xml
 */
@Configuration
/**
 * ConfigurationProperties prefix前缀指向配置文件的一级目录
 */
@ConfigurationProperties(prefix = "vegetable")
/**
 * PropertySource 告知配置文件路径
 */
@PropertySource("classpath:vegetable.properties")
public class VegetablesConfig {
    //土豆
    private String potato;
    //茄子
    private String eggplant;
    //青椒
    private String pepper;
    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getPepper() {
        return pepper;
    }

    public void setPepper(String pepper) {
        this.pepper = pepper;
    }
}
