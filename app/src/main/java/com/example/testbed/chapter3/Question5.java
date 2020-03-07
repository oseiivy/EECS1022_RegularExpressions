package com.example.testbed.chapter3;

public class Question5
{
    public static int factorial(int n)
    {
        int factorial = 1;
        try{
            if (n<0)
            {
                throw new RuntimeException("Number must not be negative");
            } else if (n>12)
            {
                throw new RuntimeException("Number must not be greater than 12");
            }
            for (int i = 2; i <= n; i = i+1)
            {
                factorial = factorial * i;
            }
            return factorial;
        }
        catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(Question5.factorial(4));
    }

}
