package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human number1 = new Human("Vasya", true, 3);
        Human number2 = new Human("Kolya", true, 3);
        Human number3 = new Human("Sveta", true, 3);
        Human number4 = new Human("Nastya", true, 3);
        Human number5 = new Human("Olya", true, 3, number1, number3);
        Human number6 = new Human("Vasya1", true, 3, number1, number3);
        Human number7 = new Human("Vasya", true, 3, number1, number3);
        Human number8 = new Human("Vasya", true, 3, number1, number3);
        Human number9 = new Human("Vasya", true, 3, number1, number3);

        System.out.println(number1.toString());
        System.out.println(number2.toString());
        System.out.println(number3.toString());
        System.out.println(number4.toString());
        System.out.println(number5.toString());
        System.out.println(number6.toString());
        System.out.println(number7.toString());
        System.out.println(number8.toString());
        System.out.println(number9.toString());

    }

    public static class Human {
        // напишите тут ваш код
        String name;
        int age;
        boolean sex;
        Human father;
        Human mother;

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


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }

    }
}