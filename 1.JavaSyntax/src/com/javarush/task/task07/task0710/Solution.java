package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

       ArrayList<String> list = new ArrayList<>();
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       for (int i = 0; i <10; i++) {
           list.add(0,reader.readLine());//напишите тут ваш код
       }

       text(list);
    }

    public static void text(List<String> sort) {
        for (int i = 0; i < sort.size(); i++) {
            System.out.println(sort.get(i));
        }
    }


}
