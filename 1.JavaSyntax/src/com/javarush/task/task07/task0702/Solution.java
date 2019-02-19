package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array = initializeArray();
        text(array);
    }

        public static String[] initializeArray() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String[] num = new String[10];
            for (int i = 0; i < 8; i++) {
                num[i] = reader.readLine();
            }
            // создай и заполни массив
            return num;
        }




    public static void text (String[] array) {


        for (int i = array.length - 1; i >= 0; i--)
            System.out.println(array[i]);
    }


        //напишите тут ваш код
}