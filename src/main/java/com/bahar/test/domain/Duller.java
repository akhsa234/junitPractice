package com.bahar.test.domain;

import java.util.Objects;

public class Duller {
   private int amount;//version 2 - add privacy
   private int times;

    public Duller(){}
    public Duller(int amount){
        this.amount=amount;
    }

     Duller times(int multiple){
     //   amount *=multiple; // version 1
        return new Duller(amount*multiple); //version 2
    }

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
// changed the Dullar to int
   public int multiple(){
        //   amount *=multiple; // version 1
        return getAmount()*getTimes(); //version 2
       // return this.getAmount()*this.getTimes();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duller duller = (Duller) o;
        return amount == duller.amount && times == duller.times;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, times);
    }
}
