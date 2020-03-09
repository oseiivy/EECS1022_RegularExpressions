package com.example.testbed.chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question1 {
    public static int digitSum(double x) {
        int sum = 0;
        int num;

        String converted = String.format("%f", x);
        String regex = "[^+-.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(converted);
        for (; matcher.find(); ) {
            num = Integer.parseInt(matcher.group());
            sum = sum + num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Question1.digitSum(-12.25));
    }
}