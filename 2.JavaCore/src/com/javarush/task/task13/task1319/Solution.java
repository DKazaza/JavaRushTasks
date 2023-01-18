package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dir = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(dir));

        StringBuilder strb = new StringBuilder();

        String s = "";
        while(!s.equals("exit")) {
            s= reader.readLine();
            strb.append(s).append("\n");
        }
        writer.write(strb.toString());
        writer.close();
    }
}
