package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<10 & a>0 & a%2==0)
            System.out.println("четное однозначное число");
        if(a<10 & a>0 & a%2==1)
            System.out.println("нечетное однозначное число");
        if(a<100 & a>9 & a%2==0)
            System.out.println("четное двузначное число");
        if(a<100 & a>9 & a%2==1)
            System.out.println("нечетное двузначное число");
        if(a<1000 & a>99 & a%2==0)
            System.out.println("четное трехзначное число");
        if(a<1000 & a>99 & a%2==1)
            System.out.println("нечетное трехзначное число");


    }
}
