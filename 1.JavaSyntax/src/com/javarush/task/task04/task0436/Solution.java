package com.javarush.task.task04.task0436;


/*
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();

        int n = Integer.parseInt(number1);
        int m = Integer.parseInt(number2);

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print("8");
            }
            System.out.println(" ");
        }//напишите тут ваш код

    }
}
