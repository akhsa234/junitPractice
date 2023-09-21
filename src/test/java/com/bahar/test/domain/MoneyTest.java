package com.bahar.test.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
created by bahar 2023-9-15
 */
public class MoneyTest {

    @Test
    public void testMultiplication(){
        Duller fiveValue= new Duller(5);
        Duller twoTimes = fiveValue.times(2);
       // assertEquals(10,twoTimes.amount); //version1
        assertEquals(new Duller(10),twoTimes); //version1

        Duller threeTimes = fiveValue.times(3);
        assertEquals(new Duller(15), threeTimes);

        Duller result = new Duller();
        result.setAmount(4);
        result.setTimes(5);
       int x=  result.multiple();


       /*
       org.opentest4j.AssertionFailedError:
        Expected :20
        Actual   :com.bahar.test.domain.Duller@16aa0a0a
        */
      //  assertEquals(20 ,   new Duller(result.multiple(result.getTimes())).; //actual and expected is obj

        assertEquals(20,x);
      //  assertEquals(20 ,   new Duller(result.multiple()).toString());


    }

    @Test
    void testEquality() {
        assertEquals(new Duller(5),new Duller(5));
        assertEquals(new Duller(5),new Duller(8));
    }
}
