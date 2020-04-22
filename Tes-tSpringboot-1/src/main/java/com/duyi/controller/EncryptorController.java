package com.duyi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncryptorController {
    @Value("${info.username}")
    private String name;
    @Value("${info.userpassword}")
    private String pass;
    @RequestMapping("/Encryptor")
    public String encryptor(){
        return name +"\t"+pass;
    }
}
