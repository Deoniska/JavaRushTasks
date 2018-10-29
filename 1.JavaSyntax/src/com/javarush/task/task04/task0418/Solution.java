package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String num1 = r.readLine();
        int a = Integer.parseInt(num1);
        String num2 = r.readLine();
        int b = Integer.parseInt(num2);

        if (a<b) System.out.println(a);
      else if (a==b) System.out.println(a);
        else System.out.println(b);


        //напишите тут ваш код
    }
}