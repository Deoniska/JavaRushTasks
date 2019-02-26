package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Играем в Jолушку
*/

public class v2 {

    public static ArrayList<Integer> tripl = new ArrayList<>();
    public static ArrayList<Integer> evenn = new ArrayList<>();
    public static ArrayList<Integer> other = new ArrayList<>();


    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = iRead();
        sort(list);
        printList(tripl);
        printList(evenn);
        printList(other);
        //напишите тут ваш код
    }


    public static ArrayList<Integer> iRead() throws Exception {
        ArrayList<Integer> rList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            rList.add(Integer.parseInt(s));
        }

        return rList;
    }

    public static void sort(ArrayList list) {

        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) % 3 == 0) {
                tripl.add((int) list.get(i));
            }
            if ((int) list.get(i) % 2 == 0) {
                evenn.add((int) list.get(i));
            }
            if (((int) list.get(i) % 3 != 0) && (int) list.get(i) % 2 != 0) {
                other.add((int) list.get(i));
            }
        }
    }


    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));//напишите тут ваш код
        }
    }
}
