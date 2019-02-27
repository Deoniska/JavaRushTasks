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
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        ArrayList<Integer> dellete = new ArrayList<>();
        ArrayList<Integer> multiplay2 = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            int count = 0;
            int dell = 0;
            int multiplay = 0;
            char[] letters = s.toCharArray();
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] == 'р') {
                    count++;
                    dell++;
                }
                if (letters[j] == 'л') {
                    count++;
                    multiplay++;
                }//напишите тут ваш код
            }
            if (count > 1&&dell>0&&multiplay>0) {

            }
            if (count < 2 && dell > 0) {
                dellete.add(i);
            }

            if (count == 2 && multiplay > 0) {
                multiplay2.add(i);
            }

        }
        return list;
    }
}