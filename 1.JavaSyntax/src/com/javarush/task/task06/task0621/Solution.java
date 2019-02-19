package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName,  null, null);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName,  null, null);

        String FatherName = reader.readLine();
        Cat catFather = new Cat(FatherName, null, grandFatherName);

        String MotherName = reader.readLine();
        Cat catMother = new Cat(MotherName, grandMotherName, null);

        String SonName = reader.readLine();
        Cat catSon = new Cat(SonName, MotherName, FatherName);

        String DaughterName = reader.readLine();
        Cat catDaughter = new Cat(DaughterName, MotherName, FatherName);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private String parent1;
        private String parent2;



        public Cat(String daughterName, String motherName, String fatherName) {
            this.name=daughterName;
            this.parent1 = motherName;
            this.parent2 = fatherName;

        }



        @Override
        public String toString() {
            if (parent1 == null && parent2 == null)
                return "The cat's name is " + name + ", no mother, no father";
            if (parent2 == null)
                return "The cat's name is " + name + ", mother is " + parent1 + ", no father";
            if (parent1 == null)
                return "The cat's name is " + name + ", no mother, father is " + parent2;
            return "The cat's name is " + name + ", mother is " + parent1 + ", father is " + parent2;
        }
    }
}
