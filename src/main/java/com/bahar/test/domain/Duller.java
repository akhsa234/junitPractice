package com.bahar.test.domain;

import java.util.Objects;

public class Duller extends Money {
private String currency;

    public Duller(){}
    public Duller(int amount){
        this.amount=amount;
        this.currency= "USD";
    }

    @Override
    protected String currency() {
        return currency;
    }

    Money times(int multiple){
     //   amount *=multiple; // version 1
        return new Duller(amount*multiple); //version 2
    }






}
