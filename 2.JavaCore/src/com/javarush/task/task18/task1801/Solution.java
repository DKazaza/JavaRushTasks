package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int max = 0;
        try(FileInputStream file = new FileInputStream(name)) {

            while (file.available() > 0) {
                int data = file.read();
                if (data > max)
                    max = data;
            }
            //file.close();
        }
        System.out.println(max);


    }

}
