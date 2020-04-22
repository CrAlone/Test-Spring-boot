package com.duyi.controller;

import com.duyi.config.FoodConfig;
import com.duyi.domain.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RsetController 是@Controller和@ResponseBody的结合
 */
@RestController
public class FoodController {
    //直接使用配置文件中key对应的值
//    @Value("${food.barbecue}")
//    private String barbecue;
//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food}")
//    private String food;
    //通过对象来使用配置文件中的值
    @Autowired
    private FoodConfig config;
    @RequestMapping("/json")
    public FoodConfig json(){
        return config;
    }
}
