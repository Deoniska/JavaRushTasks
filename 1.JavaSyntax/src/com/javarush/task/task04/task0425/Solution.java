package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String num1 = reader.readLine();
       String num2 = reader.readLine();
       int a=Integer.parseInt(num1);
       int b=Integer.parseInt(num2);

       if (a>0&&b>0) System.out.println(1);
       else if (a<0&&b>0) System.out.println(2);
       else if (a<0&&b<0) System.out.println(3);
       else if (a>0&&b<0) System.out.println(4);
        //напишите тут ваш код
    }
}
