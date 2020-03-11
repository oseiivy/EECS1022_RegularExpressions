package com.example.testbed.chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question9
{
    public static int postalDigitSum(String str) {
        int sum = 0;
        String regex = "[a-zA-z](\\d)[a-zA-z]\\s?(\\d)[a-zA-Z](\\d)(?!.*[a-zA-z](\\d)[a-zA-z]\\s?(\\d)[a-zA-Z](\\d))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            sum = sum + Integer.parseInt(matcher.group(1)) + Integer.parseInt(matcher.group(2)) + Integer.parseInt(matcher.group(3));
        } else {
            sum = -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Question9.postalDigitSum("Try M3J1P3 or m5s 2W8 and m3:9j4"));
    }
}
