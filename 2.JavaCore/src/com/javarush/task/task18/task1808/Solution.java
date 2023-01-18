package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        FileInputStream file = new FileInputStream(name1);
        FileOutputStream file2 = new FileOutputStream(name2);
        FileOutputStream file3 = new FileOutputStream(name3);
        int count=file.available();
        int centr=0;
        int start2=0;
        if(count%2==0) {
            centr = count/2;
            start2=centr+1;
        }
        else {
            centr=(count+1)/2;
            start2=centr+1;
        }
        byte[] buffer = new byte[file.available()];
        while (file.available()>0)
        {
            file.read(buffer);
            file2.write(buffer,0,centr);
            file3.write(buffer,centr,count-centr);
        }
        file.close();
        file2.close();
        file3.close();

    }
}
