package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {




    public static void main(String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList<>();
         ArrayList<Integer> tripl = new ArrayList<>();
         ArrayList<Integer> evenn = new ArrayList<>();
         ArrayList<Integer> other = new ArrayList<>();



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            list.add(Integer.parseInt(s));
        }

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 3 == 0)) {
                tripl.add(list.get(i));
            }
            if ( list.get(i) % 2 == 0) {
                evenn.add(list.get(i));
            }
            if ((list.get(i) % 3 != 0) && list.get(i) % 2 != 0) {
                other.add((list.get(i)));
            }
        }

        printList(tripl);
        printList(evenn);
        printList(other);


    }


    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));//напишите тут ваш код
        }
    }
}
