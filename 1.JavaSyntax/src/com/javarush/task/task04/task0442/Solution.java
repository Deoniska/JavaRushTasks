package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

import static java.lang.System.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum =0;


        while (true) {
            String number = reader.readLine();
            int n = Integer.parseInt(number);
            sum=sum+n;
            if (n == -1) {break;
                }
        }
       System.out.println(sum);
    }
}