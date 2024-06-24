package com.bahar.test.domain;

import java.util.Objects;

public class Duller extends Money {
   //private int amount;//version 2 - add privacy
  // private int times;

    public Duller(){}
    public Duller(int amount){
        this.amount=amount;
    }

     Duller times(int multiple){
     //   amount *=multiple; // version 1
        return new Duller(amount*multiple); //version 2
    }






}
