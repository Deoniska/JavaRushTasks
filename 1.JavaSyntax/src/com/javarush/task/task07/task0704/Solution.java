package com.javarush.task.task07.task0704;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

/*
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        text(numbers()); //напишите тут ваш код
    }

    public static int[] numbers () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[10];
        for (int i = 0; i<10; i++) {
            String s  = reader.readLine();
            num[i] = Integer.parseInt(s);
        }
        return num;
    }

    public static void text (int [] numbers) {
        for (int i = numbers.length-1;i >=0; i--) {
            System.out.println(numbers[i]);
        }
    }

}

