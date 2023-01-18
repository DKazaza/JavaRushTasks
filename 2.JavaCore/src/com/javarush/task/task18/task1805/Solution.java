package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        ArrayList<Integer> lst = new ArrayList<>();
        try (FileInputStream file = new FileInputStream(name)) {
            while (file.available() > 0) {
                lst.add(file.read());
            }
        }
        Collections.sort(lst);
        System.out.print(lst.get(0)+" ");
        for(int i=1; i< lst.size(); i++) {
            if (lst.get(i)!= lst.get(i-1))
                System.out.print(lst.get(i)+" ");
        }
    }
}
