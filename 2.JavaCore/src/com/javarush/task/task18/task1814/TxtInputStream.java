package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        String ss =fileName;
        int n = ss.length();
        ss = ss.substring(n-4, n);
        if(ss.equals(".txt")) {
           // FileInputStream file = new FileInputStream(fileName);
        }
        else {
            super.close();
            throw new UnsupportedFileNameException();

        }
    }

    public static void main(String[] args) {
    }
}

