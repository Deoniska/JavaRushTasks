package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {

    private int centerX=1;
    private int centerY=2;
    private int radius=3;
    private int width=4;
    private int color=5;

    public void initialize(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY=centerY;
        this.radius=radius;
    }

    public void initialize(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
    }
    public void initialize(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
