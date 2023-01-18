package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        int n = Collections.min(array);
        return n;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < N; i++)
        {
            lst.add(sc.nextInt());
        }
        return lst;
    }
}
