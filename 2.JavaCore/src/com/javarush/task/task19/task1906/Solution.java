package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileReader readfile = new FileReader(file1);
        FileWriter writer = new FileWriter(file2);
        while (readfile.ready()) {
            int data = readfile.read();

            data = readfile.read();
            writer.write(data);
        }
        reader.close();
        readfile.close();
        writer.close();
    }
}
