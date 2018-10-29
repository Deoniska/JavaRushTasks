package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String valueString1 = reader.readLine();
        String valueString2 = reader.readLine();
        String valueString3 = reader.readLine();

        int value1 = Integer.parseInt(valueString1);
        int value2 = Integer.parseInt(valueString2);
        int value3 = Integer.parseInt(valueString3);

        ArrayList<Integer> MyList = new ArrayList<Integer>();
        MyList.add(value1);
        MyList.add(value2);
        MyList.add(value3);

        int count = 0;
        for (int i = 0; i < MyList.size(); i++)
        {
            if(MyList.get(i) >0 )
                count = count + 1;

        }
        System.out.println(count);
    }
}







        //напишите тут ваш код
