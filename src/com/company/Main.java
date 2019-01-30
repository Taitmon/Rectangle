package com.company;
public class Main
{

    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 8;
        rectangle.height = 4;

        System.out.println("The height is:" + rectangle.height);
        System.out.println("The width is:" + rectangle.width);

        rectangle.doubleHeight();
        System.out.println("The height doubled is: " + rectangle.height);

        rectangle.doubleWidth();
        System.out.println("The width doubled is: " + rectangle.width);

        rectangle.rotate(rectangle.height, rectangle.width);
        System.out.println("If the triangle is rotated the height is: " + rectangle.height + " and the width is " + rectangle.width);

    }
}
