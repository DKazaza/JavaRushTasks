package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<String> lst = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            lst.add(s);
        }
        int min=lst.get(0).length(), max=lst.get(0).length();
        int minind=0,maxind=0;
        for (int k=1; k<10; k++){
            if(min > lst.get(k).length()){
                min=lst.get(k).length();
                minind=k;
            }
            if(max < lst.get(k).length()){
                max=lst.get(k).length();
                maxind=k;
            }

        }
        if(minind <= maxind)
            System.out.println(lst.get(minind));
        else System.out.println(lst.get(maxind));
    }
}
