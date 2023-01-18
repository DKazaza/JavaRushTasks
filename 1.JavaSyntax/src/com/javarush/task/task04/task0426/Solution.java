package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0 & a>0)
            System.out.println("положительное четное число");
        if (a%2==0 & a<0)
            System.out.println("отрицательное четное число");
        if (a%2==1 & a>0)
            System.out.println("положительное нечетное число");
        if (a%2==-1 & a<0)
            System.out.println("отрицательное нечетное число");
        if (a==0)
            System.out.println("ноль");

    }
}
