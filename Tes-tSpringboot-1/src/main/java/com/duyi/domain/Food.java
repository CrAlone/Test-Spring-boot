package com.duyi.domain;

public class Food {
    //烤肉拌饭
    private String barbecue;
    private String rice;
    public Food() {
    }
    public Food(String barbecue, String rice) {
        this.barbecue = barbecue;
        this.rice = rice;
    }
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
