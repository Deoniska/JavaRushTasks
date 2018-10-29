package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int a = Integer.parseInt(number1);
        String number2 = reader.readLine();
        int b = Integer.parseInt(number2);
        String number3 = reader.readLine();
        int c = Integer.parseInt(number3);

        if ((a+b>c)&&(a+c>b)&&(c+b>a)) {
            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не существует.");
        }

        //напишите тут ваш код
    }
}