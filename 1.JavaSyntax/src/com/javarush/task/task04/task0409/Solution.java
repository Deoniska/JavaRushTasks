package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

//import com.sun.tools.internal.xjc.model.CBuiltinLeafInfo;

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }




    public static void closeToTen(int a, int b) {
        int CA;
        int BC;
        CA = abs(10-a);
        BC = abs(10-b);
        if (CA < BC)
        {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }


    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}