package com.example.testbed.chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question10
{
    public static String get24Time(String str)
    {
        int pmHour;
        String convertedTime;
        String regex = "([1-12]:([0-5][0-9])\\s?[aA|(pP)][mM](?!.*[1-12]:([0-5][0-9])\\s?[aA|(pP)][mM]))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find())
        {
           pmHour = Integer.parseInt(matcher.group(1)) + 12;
           convertedTime = String.format("%d",pmHour) + "matcher.group(2)";
        }
        else
        {
            convertedTime = "";
        }
        return convertedTime;
    }

    public static void main(String[] args) {
        System.out.println(Question10.get24Time("9:25 Pm"));
    }

}
