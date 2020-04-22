package com.duyi.controller;

import com.duyi.config.PersonConfig;
import com.duyi.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonConfig config;
    @RequestMapping("/person")
    public Person person(){
        Person p = new Person();
        p.setAge(config.getAge());
        p.setName(config.getName());
        p.setSex(config.getSex());
        return p;
    }
}
