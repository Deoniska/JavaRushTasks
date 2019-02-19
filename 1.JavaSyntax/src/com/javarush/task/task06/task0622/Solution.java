package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {

    public static int readNumber() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int ns = Integer.parseInt(s);
        return ns;
    }


    public static void main(String[] args) throws Exception {


       ArrayList<Integer> sort = new ArrayList<>();
       for (int i =0; i<5;i++){
       sort.add(readNumber());}

       Collections.sort(sort);

        for (int i = 0; i < 5; i++) {
            System.out.println(sort.get(i));
        }

        //напишите тут ваш код
    }
}
