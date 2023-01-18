package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k=0,j = 0;
        if (a>0)
            k+=1;
        else if (a<0) j+=1;
        if (b>0)
            k+=1;
        else if (b<0) j+=1;
        if (c>0)
            k+=1;
        else if (c<0) j+=1;
        System.out.println("количество отрицательных чисел: "+j);
        System.out.println("количество положительных чисел: "+k);

    }
}
