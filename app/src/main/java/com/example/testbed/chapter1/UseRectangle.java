package com.example.testbed.chapter1;

public class UseRectangle
{
    public static void main(String[] args)
    {
        int x = 3;
        int y = 4;
        int c = Rectangle1.getCircumference(x,y);
        System.out.println(c);

        Rectangle2 r = new Rectangle2(x,y);
        int a = r.getArea();
        System.out.println(a);

    }
}
