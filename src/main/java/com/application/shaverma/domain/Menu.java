package com.application.shaverma.domain;

import jakarta.persistence.Entity;

@Entity
public class Menu {
    // need some annotations to add, for db connection
    private int num;
    private String name;
    private String discription;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
