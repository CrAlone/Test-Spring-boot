package com.duyi.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class Encryption {
    public static void main(String[] args) {
        //创建一个加密对象
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword("123456!@#");
        String chendaye = basicTextEncryptor.encrypt("chendaye");
        String hahaha = basicTextEncryptor.encrypt("hahaha");
        System.out.println(chendaye);
        System.out.println(hahaha);

    }
}
