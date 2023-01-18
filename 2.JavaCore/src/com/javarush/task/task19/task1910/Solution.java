package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader readfile =new BufferedReader(new FileReader(file1));
        BufferedWriter writer =new BufferedWriter(new FileWriter(file2));
        writer.write(readfile.readLine().replaceAll("[\\p{P}]", ""));

        readfile.close();
        writer.close();
    }
}
