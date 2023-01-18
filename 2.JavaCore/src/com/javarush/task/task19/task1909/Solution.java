package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader readfile =new BufferedReader(new FileReader(file1));
        BufferedWriter writer =new BufferedWriter(new FileWriter(file2));
        while (readfile.ready()) {
            int data = readfile.read();
            if (data == 46) data = 33;
            writer.write(data);
        }

        readfile.close();
        writer.close();
    }
}
