package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name2 = reader.readLine();

        FileInputStream file1 = new FileInputStream(name);
        FileInputStream file2 = new FileInputStream(name2);
        FileOutputStream out = new FileOutputStream(name);
        List<Integer> summa = new ArrayList<>();
        while (file2.available() > 0) {
            summa.add(file2.read());
        }
        file2.close();
        while (file1.available() > 0) {
            summa.add(file1.read());
        }
        file1.close();
        for(Integer lst : summa) {
            out.write(lst);
        }
        out.close();


    }
}
