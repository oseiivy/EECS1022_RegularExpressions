package com.example.testbed.chapter3;

public class Question4
{
    public static double moviePrice(int age, String dayCode)
    {
        int price;
        if (dayCode.equals("W") || age < 10)
        {
            price = 8;
        }
        else if (age >= 10 && age <= 17 || age > 60)
        {
            price = 10;
        }
        else
        {
            price = 12;
        }
        return price;
    }

    public static void main(String[] args) {
        System.out.println(Question4.moviePrice(18, "R"));
    }
}
