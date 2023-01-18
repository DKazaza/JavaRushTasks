package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream file = new FileInputStream(name);
        int count=0;
        while(file.available() > 0) {
            if(file.read()==44)
                count++;
        }
        file.close();
        System.out.println(count);
    }
}
