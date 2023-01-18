package com.javarush.task.task13.task1326;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dir = reader.readLine();
        FileInputStream file = new FileInputStream(dir);
        Scanner scan = new Scanner(file);
        ArrayList<Integer> all = new ArrayList<>();
        while (scan.hasNextLine()){
            int b = scan.nextInt();
            if(b%2==0)
            all.add(b);
        }
        file.close();
        Collections.sort(all);
        for (Integer abc: all
             ) {
            System.out.println(abc);
        }

    }
}
