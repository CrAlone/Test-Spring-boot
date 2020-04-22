package com.duyi;

import com.duyi.config.FoodConfig;
import com.duyi.config.VegetablesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
/**
 * @EnableConfigurationProperties
 * 告诉主程序入口，要自动引入配置文件，配置文件对应的类作为他的参数
 */
//烤肉拌饭
@EnableConfigurationProperties({FoodConfig.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
