package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = read();
        sort(list);//напишите тут ваш код
    }

    public static ArrayList<String> read() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        return list;
    }

    public static void sort(ArrayList<String> list) {

        for (int j = 0; j < 9; j++) {
            if (list.get(j + 1).length() < list.get(j).length()) {
                System.out.println(j + 1);
                break;
            }
        }
    }
}

