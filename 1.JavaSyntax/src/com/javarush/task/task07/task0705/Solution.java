package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] megaArray = megaArray();
        text(megaArray);


        //напишите тут ваш код
    }
    public static int[] megaArray () throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i =0; i<20; i++) {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }


        int[] array1 = new int[10];
        int[] array2 = new int[10];

        System.arraycopy(array,0,array1,0,10);
        System.arraycopy(array,10,array2,0,10);
        return array2;
    }

    public static void text (int[] megaArray) {


        for (int i = 0; i< megaArray.length; i++)
            System.out.println(megaArray[i]);
    }



}


