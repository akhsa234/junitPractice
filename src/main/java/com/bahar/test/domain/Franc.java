package com.bahar.test.domain;

public class Franc extends Money {
private String currency;
    public Franc(){}
    public Franc(int amount){
        this.amount=amount;
        this.currency="CHF";
    }

    @Override
    protected String currency() {
        return currency;
    }

    Money times(int multiple){
        return new Franc(amount*multiple);
    }
}
