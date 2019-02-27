package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира");
        list.add("мера");
        list.add("вода");
        list.add("упор");// 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        ArrayList<String> newList = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);


            boolean p = false;
            boolean l = false;


            char[] letters = s.toCharArray();
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] == 'р') {

                    p=true;
                }
                if (letters[j] == 'л') {

                    l=true;
                }//напишите тут ваш код
            }

            if (p&&l==true) { newList.add(list.get(i));

            }
            else if (p==true){

            }
            else if (l==true) {
                newList.add(list.get(i));
                newList.add(list.get(i));
            }
            else newList.add(list.get(i));

        }
        return newList;
    }
}