package com.duyi.controller;

import com.duyi.config.VegetablesConfig;
import com.duyi.domain.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VegetableController {
    //蔬菜
    @Autowired
    private VegetablesConfig config;
    @RequestMapping("/vegetable")
    public Vegetables json(){
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(config.getPotato());
        vegetables.setPepper(config.getPepper());
        vegetables.setEggplant(config.getEggplant());
        return vegetables;
    }
}
