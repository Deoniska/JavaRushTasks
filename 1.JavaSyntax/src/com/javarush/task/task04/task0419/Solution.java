package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        String number4 = reader.readLine();

        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        int d = Integer.parseInt(number4);

        if ((a>=b)&&(a>=c)&&(a>=d)) System.out.println(a);
        else if ((b>=a)&&(b>=c)&&(b>=d)) System.out.println(b);
        else if ((c>=a)&&(c>=b)&&(c>=d)) System.out.println(c);
        else if ((d>=a)&&(d>=b)&&(d>=c)) System.out.println(d);

        //напишите тут ваш код
    }
}
