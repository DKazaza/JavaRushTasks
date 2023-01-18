package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        exceptions.add(new RuntimeException("1"));
        exceptions.add(new Exception("2"));
        exceptions.add(new NullPointerException("3"));
        exceptions.add(new ClassNotFoundException("4"));
        exceptions.add(new ClassCastException("5"));
        exceptions.add(new IOException("6"));
        exceptions.add(new InterruptedIOException("7"));
        exceptions.add(new SecurityException("8"));
        exceptions.add(new IllegalStateException("9"));

    }
}
