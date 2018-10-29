package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);

        if (n1 == n2 & n2 == n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        }
        else {
            if (n1 == n2) {
                System.out.println(n1 + " " + n2);
            }
            if (n2 == n3) {
                System.out.println(n2 + " " + n3);
            }
            if (n1 == n3) {
                System.out.println(n1 + " " + n3);
            }
        }
    }
}