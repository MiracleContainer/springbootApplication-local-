package com.example.Entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author miracle_wzx
 * @Package com.example.Entity
 * @Description:
 * @date 2018/5/7上午11:12
 */
public class Account {

    @Autowired
        private int id ;
    @Autowired
        private String name ;
    @Autowired
        private double money;


    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getId() {
        return id;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
