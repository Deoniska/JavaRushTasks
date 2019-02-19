package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = line();
        int[] numbers = numbers(strings);
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //напишите тут ваш код
    }
    public static String[] line () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] num = new String[10];
        for (int i=0; i<10; i++) {
            num[i] = reader.readLine();
        }
        return num;
    }
    public static int[] numbers(String[] strings) {
        int[] counter = new int[10];
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            counter[i] = string.length();
        }
        return counter;
    }
}
