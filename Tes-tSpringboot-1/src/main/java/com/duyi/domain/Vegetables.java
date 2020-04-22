package com.duyi.domain;

public class Vegetables {
    //土豆
    private String potato;
    //茄子
    private String eggplant;
    //青椒
    private String pepper;

    public Vegetables() {
    }

    public Vegetables(String potato, String eggplant, String pepper) {
        this.potato = potato;
        this.eggplant = eggplant;
        this.pepper = pepper;
    }

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
