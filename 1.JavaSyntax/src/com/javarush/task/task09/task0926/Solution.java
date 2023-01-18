package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> lst = new ArrayList<>();
        int[] a5;
        int[] a2;
        int[] a4;
        int[] a7;
        int[] a0;
        a5 = new int[5];
        a2 = new int[2];
        a4 = new int[4];
        a7 = new int[7];
        a0 = new int[0];
        lst.add(a5);
        lst.add(a2);
        lst.add(a4);
        lst.add(a7);
        lst.add(a0);
        return lst;


    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
