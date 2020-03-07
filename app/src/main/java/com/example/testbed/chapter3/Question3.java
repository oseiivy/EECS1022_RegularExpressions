package com.example.testbed.chapter3;

public class Question3
{
    public static int sumSquares(int a, int b)
    {
        int sum = 0;
        for(int i = a; i <= b; i = i+1)
        {
            double squared = Math.pow(i, 2);
            sum = (int) squared + sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Question3.sumSquares(3,5));
    }
}
