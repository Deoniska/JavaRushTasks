package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        text(sort(sList()));

        ;//напишите тут ваш код
    }

    public static List<String> sList() throws Exception {
        //  ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        return strings;
    }

    public static ArrayList<String> sort(List<String> sList) {
        ArrayList<String> list = new ArrayList<String>();
        String s = "";
        int n = s.length();
        for (int i = 0; i < sList.size(); i++) {

            if (n <= sList.get(i).length()) {
                s = sList.get(i);
                n = sList.get(i).length();
            }
        }
        for (int i = 0; i < sList.size(); i++) {
            if (n == sList.get(i).length()) {
                s = sList.get(i);
                list.add(s);
            }
        }

        return list;
    }

    public static void text(ArrayList<String> sort) {
        for (int i = 0; i < sort.size(); i++) {
            System.out.println(sort.get(i));
        }
    }

}
