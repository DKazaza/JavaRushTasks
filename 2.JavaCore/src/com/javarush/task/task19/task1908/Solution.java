package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        BufferedReader readfile = new BufferedReader(new FileReader(file1));
        BufferedWriter writefile = new BufferedWriter(new FileWriter(file2));
        StringBuilder text = new StringBuilder();
        char curch;
        while(readfile.ready()) {
            curch = (char) readfile.read();
            text.append(curch);
        }
        String razbit = text.toString().replaceAll("\\D", " ").replaceAll("\\s", " ");

    }
}
