package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn = reader.readLine();
        int n = Integer.parseInt(sn);
        String sm = reader.readLine();
        int m = Integer.parseInt(sm);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i<n; i++) {
list.add(reader.readLine());
        }

        for (int j=0; j<m; j++) {
            list.add(list.get(j));
        }

        for (int с=0; с<m; с++) {
            list.remove(0);
        }

        for (int p = 0; p<list.size(); p++) {
            System.out.println(list.get(p));
        }

        //напишите тут ваш код
    }
}
