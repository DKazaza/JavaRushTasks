package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double x= weight/height/height;
            if (x < 18.5) System.out.println("Недовес: меньше чем 18.5");
            if (x >= 18.5 && x < 25) System.out.println("Нормальный: между 18.5 и 25");
            if (x >= 25 && x < 30) System.out.println("Избыточный вес: между 25 и 30");
            if (x >= 30) System.out.println("Ожирение: 30 или больше");

        }
    }
}
