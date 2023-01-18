package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        PrintStream constr = System.out;
        ByteArrayOutputStream oust = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(oust);
        System.setOut(stream);

        testString.printSomething();

        FileOutputStream writer = new FileOutputStream(file);
        writer.write(oust.toByteArray());
        writer.close();

        System.setOut(constr);
        System.out.println(oust.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

