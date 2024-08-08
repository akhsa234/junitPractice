package com.bahar.test.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
created by bahar 2023-9-15
 */
public class MoneyTest {

    @Test
    public void testMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
    }

    @Test
    void testEquality() {

        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));

        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    @Test
    public void testVersionOneFrank(){
        Money sixValue= Money.franc(6);
        Money threeTimes = sixValue.times(3);
        assertEquals(new Franc(12),threeTimes);
    }

    @Test
    public void testVersionTwoFrank(){
        Franc result = new Franc();
        result.setAmount(6);
        result.setTimes(3);
        int x=  result.multiple();
        result.equals(x);
        assertEquals(20,x);
    }

    @Test
    public void testCurrency(){
        assertEquals("USD",Money.dollar(1).currency());
        assertEquals("CHF",Money.franc(1).currency());
    }

}
