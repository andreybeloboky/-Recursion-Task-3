package com.company;

/*
 @param i - user value;
 @return calculator factorial;
 */
public class FactorialCreator {
    public static int calculator(int i) {
        if (i == 1) {
            return 1;
        }
        return i * calculator(i - 1);
    }
}
