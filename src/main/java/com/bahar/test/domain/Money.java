package com.bahar.test.domain;

import java.util.Objects;

public class Money {
    protected int amount;//version 3
    protected int times;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    // changed the Money to int
    public int multiple(){
        //   amount *=multiple; // version 1
        return getAmount()*getTimes(); //version 2
        // return this.getAmount()*this.getTimes();

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return amount == money.amount && times == money.times;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, times);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", times=" + times +
                '}';
    }
}
