package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFathersFather = new Human("Дедушка Вася", true, 90);
        Human grandMothersFather = new Human("Бабушка Даша", false, 85);
        Human grandFathersMother = new Human("Дедушка Сережа", true, 85);
        Human grandMothersMother = new Human("Бабушка Ира", false, 80);

        Human father = new Human("папа Леша", true, 50, grandFathersFather, grandMothersFather);
        Human mother = new Human ("Мама лена", false,45,grandFathersMother, grandMothersMother);

        Human child1 = new Human ("Сын Станислав", true, 20, father,mother);
        Human child2 = new Human ("Дочь Елена", false, 18, father,mother);
        Human child3 = new Human ("Сын Дима", true, 15, father,mother);

        System.out.println(grandFathersFather);
        System.out.println(grandMothersFather);
        System.out.println(grandFathersFather);
        System.out.println(grandMothersMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        // напишите тут ваш код
    }

    public static class Human {

        private  String name;
        private  Human father;
        private  Human mother;
        private  int age;
        private  boolean sex;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}