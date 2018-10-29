package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int incStr = this.strength>anotherCat.strength ?1:0;
        return (incStr)>0;
        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
