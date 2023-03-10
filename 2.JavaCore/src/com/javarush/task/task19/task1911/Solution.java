package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream constr = System.out;

        ByteArrayOutputStream oust = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(oust);
        System.setOut(stream);

        testString.printSomething();
        String result = oust.toString().toUpperCase();
        System.setOut(constr);
        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
