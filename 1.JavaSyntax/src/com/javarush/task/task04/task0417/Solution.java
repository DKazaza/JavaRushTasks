package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a==b&b==c)
            System.out.println(a+" "+b+" "+c);
        else if (a==b)
            System.out.print(a+" "+b);
        else if (b==c)
            System.out.println(b+" "+c);
        else if (a==c)
            System.out.println(a+" "+c);

    }
}