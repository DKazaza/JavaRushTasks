package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> psld = new ArrayList<>();
        BufferedReader txt = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            int a = Integer.parseInt(txt.readLine());
            psld.add(a);
        }
        int dl = 1;
        int max = 1;
        for (int i = 0; i < psld.size()-1; i++){
            if (psld.get(i).equals(psld.get(i+1))){
                max=max+1;
                if  (max > dl)
                    dl=max;
            }
            else {
                    max = 1;
            }
        }
        System.out.println(dl);



    }
}
