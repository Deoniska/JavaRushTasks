package com.javarush.task.task04.task0413;

/*
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int n = Integer.parseInt(number);
        String t;
        if (n==1)t = "понедельник";
        else if (n==2) t = "вторник";
        else if (n==3) t = "среда";
        else if (n==4) t = "четверг";
        else if (n==5) t = "пятница";
        else if (n==6) t = "суббота";
        else if (n==7) t = "воскресенье";
        else {
            t = "такого дня недели не существует";
        }
        System.out.println(t);
        //напишите тут ваш код
    }
}