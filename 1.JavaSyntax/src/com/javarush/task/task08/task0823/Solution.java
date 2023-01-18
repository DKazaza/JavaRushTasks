package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String out=string.substring(0,1).toUpperCase()+string.substring(1);


        //напишите тут ваш код
        for(int i = 2; i< out.length(); i++) {
            if(string.substring(i-1,i).equals(" ")) {
                out=out.substring(0,i)+out.substring(i,i+1).toUpperCase()+out.substring(i+1);
            }

        }
        System.out.println(out);
    }
}
