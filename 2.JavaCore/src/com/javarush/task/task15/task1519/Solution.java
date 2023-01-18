package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        String txt;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            txt = reader.readLine();
            if (txt.equals("exit")) break;
            try {
                if (txt.contains(".")) {
                    print(Double.parseDouble(txt));
                }
                if(Integer.parseInt(txt)>0&&Integer.parseInt(txt)<128) {
                    print(Short.parseShort(txt));
                }
                if(Integer.parseInt(txt)<=0&&Integer.parseInt(txt)>=128) {
                    print(Integer.parseInt(txt));
                }

            }
            catch (Exception e) {
                print(txt);
            }

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
