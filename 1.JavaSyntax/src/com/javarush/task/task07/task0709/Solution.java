package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {

        public static void main(String[] args) throws Exception {
            text(sort(sList()));
        }
            ;//напишите тут ваш код


        public static ArrayList<String> sList() throws Exception {
            ArrayList<String> list = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 5; i++) {
                list.add(reader.readLine());
            }
            return list;
        }

        public static ArrayList<String> sort(ArrayList<String> sList) {
            ArrayList<String> list = new ArrayList<String>();
            String s = sList.get(0);
            int n = s.length();
            for (int i = 0; i < sList.size(); i++) {

                if (n >= sList.get(i).length()) {
                    s = sList.get(i);
                    n = sList.get(i).length();
                }
            }
            // list.add(s);
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
