package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String yers = reader.readLine();
        String mounth = reader.readLine();
        String days = reader.readLine();


        int y = Integer.parseInt(yers);
        int d = Integer.parseInt(days);
        int m = Integer.parseInt(mounth);

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);


        //напишите тут ваш код
    }
}
