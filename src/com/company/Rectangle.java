package com.company;

public class Rectangle
{
    int height, width;

    public void doubleHeight()
    {
        this.height = this.height * 2;
    }
    public void doubleWidth()
    {
        this.width = this.width * 2;
    }

    public void rotate(int width, int height )
    {
        this.height = height;
        this.width = width;

        width = this.height;
        height = this.width;
    }
}
