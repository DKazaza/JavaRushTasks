package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int k=0;
        int s=0;
        while (true) {
            int n = sc.nextInt();
            if (n == -1)
                break;
            else {
                k += 1;
                s = s + n;
            }
        }
            System.out.println(s*1.0/k);
    }
}

