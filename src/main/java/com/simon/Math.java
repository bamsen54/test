package com.simon;

public class Math {

    public static int factorial(int n) {

        return ( n < 2 ) ? 1 :  n * factorial(n - 1);
    }
}
