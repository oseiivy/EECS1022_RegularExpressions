package com.example.testbed.chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question2
{
    public static boolean isValidDNA(String dna)
    {
        String regex = "^[A][T][G][ACGT]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dna);

        if (matcher.find() && dna.length() % 3 == 0)
        {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Question2.isValidDNA("ATGACG"));
    }
}

