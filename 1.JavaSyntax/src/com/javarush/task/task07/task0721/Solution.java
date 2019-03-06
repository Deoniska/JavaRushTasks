package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[20];
        for (int i = 0; i < 20; i++) {
            count[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = count[0];
        int minimum = count[0];
        for (int j = 0; j < count.length; j++) {
           if (count[j] > maximum) {
               maximum = count[j];
           }
           if (count[j] < minimum) {
               minimum = count[j];
           }
        }


        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
