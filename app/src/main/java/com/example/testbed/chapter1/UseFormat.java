package com.example.testbed.chapter1;

public class UseFormat
{
    public static void main(String[] args)
    {
        String a = String.format("%7d", 10350);
        System.out.println(a);

        String b = String.format("%-7d", 10350);
        System.out.println(b);

        String c = String.format("%3d", 10350);
        System.out.println(c);

        String d = String.format("%7f", 10350);
        System.out.println(d);
    }
}
