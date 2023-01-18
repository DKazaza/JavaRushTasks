package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        FileOutputStream file1 = new FileOutputStream(name);
        FileInputStream file2 = new FileInputStream(name2);
        FileInputStream file3 = new FileInputStream(name3);
        List<Integer> summa = new ArrayList<>();
        while (file2.available() > 0) {
            summa.add(file2.read());
        }
        file2.close();
        while (file3.available() > 0) {
            summa.add(file3.read());
        }
        file3.close();
        for (Integer lst:
             summa) {
            file1.write(lst);
        }
        file1.close();


    }
}
