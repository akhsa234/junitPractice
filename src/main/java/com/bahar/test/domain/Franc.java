package com.bahar.test.domain;

public class Franc extends Money {

    public Franc(){}
    public Franc(int amount){
        this.amount=amount;
    }

    Money times(int multiple){
        return new Franc(amount*multiple);
    }
}
