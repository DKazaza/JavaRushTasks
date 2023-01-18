package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int god = sc.nextInt();
        if (god%400==0)
            System.out.println("количество дней в году: 366");
        else if (god%100==0)
            System.out.println("количество дней в году: 365");
        else if (god%4==0)
            System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");

    }
}