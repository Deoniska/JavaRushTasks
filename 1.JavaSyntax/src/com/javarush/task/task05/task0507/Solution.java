package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summ=0;
        double count=0;

       while (true) {
           String number = reader.readLine();
           int n = Integer.parseInt(number);

           if (n==-1){break;}


           summ=summ+n;
           count++;


       }

        System.out.println(summ / count);
        //напишите тут ваш код
    }
}

