package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        if (t%5<3)
            System.out.println("зелёный");
        if (t%5>=3 & t%5<4)
            System.out.println("жёлтый");
        if (t%5>=4)
            System.out.println("красный");

    }
}