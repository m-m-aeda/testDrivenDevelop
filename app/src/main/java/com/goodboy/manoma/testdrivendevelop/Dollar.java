package com.goodboy.manoma.testdrivendevelop;

/**
 * Created by mitsukim on 2018/02/28.
 */
public class Dollar {
    int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }
    void times(int multiplier) {
        amount *= multiplier;
    }
}
