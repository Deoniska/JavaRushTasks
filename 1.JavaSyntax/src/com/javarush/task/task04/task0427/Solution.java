package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int n = Integer.parseInt(number);

        if ((n%2==0)&&(number.length()==1)&&(n>0)) {System.out.println("четное однозначное число");}
        else if ((n%2!=0)&&(number.length()==1)&&(n>0)) {System.out.println("нечетное однозначное число");}
        else if ((n%2==0)&&(number.length()==2)&&(n>0)) {System.out.println("четное двузначное число");}
        else if ((n%2!=0)&&(number.length()==2)&&(n>0)) {System.out.println("нечетное двузначное число");}
        else if ((n%2==0)&&(number.length()==3)&&(n>0)) {System.out.println("четное трехзначное число");}
        else if ((n%2!=0)&&(number.length()==3)&&(n>0)) {System.out.println("нечетное трехзначное число");}//напишите тут ваш код

    }
}
