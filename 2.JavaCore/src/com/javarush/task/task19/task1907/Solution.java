package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        reader.close();
        BufferedReader readfile =new BufferedReader(new FileReader(file1));
        StringBuilder text = new StringBuilder();
        char curch;
        while(readfile.ready()) {
            curch = (char) readfile.read();
            text.append(curch);
        }
        String razbit = text.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
        int x=0;
        for (String current: razbit.split(" ")) {
            if( current.equals("world"))
                x++;
        }
        readfile.close();
        System.out.println(x);
    }
}


