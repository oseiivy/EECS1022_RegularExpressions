package com.example.testbed.chapter3;

public class Question6
{
    public static int calc(int a, int b)
    {
        int count = 0;
        try{
            if (a>b)
            {
                throw new RuntimeException("First number must not be greater than second number");
            } else if (a < 0 && b < 0)
            {
                throw new RuntimeException("Both numbers must not be negative");
            }
            for (int i = a; i <= b; i = i+1)
            {
                double root = Math.sqrt(i);
                if (root % 1 == 0)
                {
                    count = count + 1;
                }

            }
            return count;
        } catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Question6.calc(1, 16));
    }
}

