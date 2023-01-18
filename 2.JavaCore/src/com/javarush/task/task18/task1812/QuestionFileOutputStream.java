package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    public AmigoOutputStream a;


    public QuestionFileOutputStream(AmigoOutputStream outputStream) {
        this.a = outputStream;
    }

    @Override
    public void flush() throws IOException {
        a.flush();

    }

    @Override
    public void write(int b) throws IOException {
        a.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {
        a.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        a.write(b, off, len);

    }

    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if(s.equals("Д"))
            a.close();
    }

}

