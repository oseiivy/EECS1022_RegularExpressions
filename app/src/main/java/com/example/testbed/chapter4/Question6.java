package com.example.testbed.chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question6
{
    public static int telCount(String s)
    {
        int count = 0;
        String regex = "\\d{3}[-\\s]\\d{3}[-\\s]\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        for (;matcher.find();)
        {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Question6.telCount("416-355 4687089 098-3454 098-965 7456"));
    }

}
