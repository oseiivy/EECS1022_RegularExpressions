package com.example.testbed.chapter3;

public class Question8
{
    public static double reciprocalSum(int n, int m)
    {
        if (n <= m)
        {
            double sum = 0;

            for (int i = n; i <= m; i = i+1)
            {
                double reciprocal = (double) 1/i;
                sum = sum + reciprocal;

            }
            String answer = String.format("%.2f", sum);
            double finalSum = Double.parseDouble(answer);
            return finalSum;
        } else {
            double division = (double) n/m;
            String conversion = String.format("%.2f", division);
            double finalAnswer = Double.parseDouble(conversion);
            return finalAnswer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Question8.reciprocalSum(5, 3));
    }
    }

