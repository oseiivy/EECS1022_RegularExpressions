package com.example.testbed.chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question7
{
    public static int totalCredit(String str)
    {
        int sum = 0;
        String regex = "([E][E][C][S]|[e][e][c][s]|[C][S][E]|[c][s][e])\\d{4}\\.+\\[?(\\d)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        for (; matcher.find();)
        {
            sum = sum + Integer.parseInt(matcher.group(2));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Question7.totalCredit("Course EECS1022..3 and CSE1020.[4] with CSE3241 or CSE6215...8"));
    }
}
