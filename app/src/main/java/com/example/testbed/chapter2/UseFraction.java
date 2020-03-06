package com.example.testbed.chapter2;

import ca.roumani.i2c.Fraction;

public class UseFraction
{
    public static void main(String[] args)
    {
        Fraction x = new Fraction(83, 100);
        Fraction y = new Fraction(5, 9);
        Fraction z = new Fraction(667, 1000);
        Fraction t = new Fraction(-2, 3);

        x.add(y);
        t.add(z);
        x.divide(t);

        System.out.println(x.toString());
        System.out.println(x.toProperString());

    }
}
