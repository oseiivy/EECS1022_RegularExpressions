package com.example.testbed.chapter1;

public class UseMath
{
    public static void main(String[] args)
    {
        double a = Math.pow(27, 0.3);
        System.out.println(a);

        double b = Math.pow(27, 0.3333);
        System.out.println(b);

        double c = Math.pow(27, 1/3);
        System.out.println(c);

        double d = Math.pow(27, 1.0/3.0);
        System.out.println(b);
    }
}
