package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = array();
        System.out.println(sort(array));//напишите тут ваш код
    }

    public static int[] array() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        return array;
    }

    public static String sort(int[] array) {
        String s1 = "В домах с нечетными номерами проживает больше жителей.";
        String s2 = "В домах с четными номерами проживает больше жителей.";
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            if (i% 2 == 0) {
                positive = positive + array[i];
            } else {
                negative = negative + array[i];
            }

        }
        if (negative > positive) {
            return s1;
        }
        return s2;
    }
}
