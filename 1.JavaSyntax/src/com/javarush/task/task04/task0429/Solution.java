package com.javarush.task.task04.task0429;

/*
Положительные и отрицательные числа
*/

        import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        int pos = 0;
        int neg = 0;
        if (a > 0) {
            pos++;
        }
        else if (a<0) {
            neg++;
        }
        if (b > 0) {
            pos++;
        }
        else if (b<0) {
            neg++;
        }
        if (c > 0) {
            pos++;
        }
        else if (c<0){
            neg++;
        }
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos); //напишите тут ваш код

    }
}
