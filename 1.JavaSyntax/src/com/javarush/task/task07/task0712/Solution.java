package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        List<String> superList = rList();
        String s = superList.get(first(minLenght(superList), maxLenght(superList)));
        System.out.println(s);

        //напишите тут ваш код
    }

    public static int first(int minLenght, int maxLenght) {
        if (minLenght < maxLenght) {
            return minLenght;
        }
        return maxLenght;
    }

    public static List<String> rList() throws Exception {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        return list;
    }


    public static int minLenght(List<String> superList) {
        String s = superList.get(0);
        int n = s.length();
        int index = 0;
        for (int i = 0; i < superList.size(); i++) {

            if (n > superList.get(i).length()) {
                n = superList.get(i).length();
                index = i;
            }
        }

        return index;
    }

    public static int maxLenght(List<String> superList) {
        String s = "";
        int n = s.length();
        int index = 0;
        for (int i = 0; i < superList.size(); i++) {

            if (n < superList.get(i).length()) {
                n = superList.get(i).length();
                index = i;
            }
        }

        return index;
    }

}
