package com.cloud.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Table;

import com.cloud.database.BaseEntity;


@Table(name = "user")
public class User extends BaseEntity implements Serializable{

    private String name;
    private Integer age;
    private BigDecimal balance;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}