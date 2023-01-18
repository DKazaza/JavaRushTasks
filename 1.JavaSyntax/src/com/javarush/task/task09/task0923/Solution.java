package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] s2 = s.toCharArray();
        String prb = " ";
        ArrayList<Object> glas = new ArrayList<>();
        ArrayList<Object> sogl = new ArrayList<>();
        for(char test : s2) {
            if (isVowel(test)) {
                glas.add(test);
                glas.add(" ");
            } else {
                if (Character.isWhitespace(test)){

                }
                else {
                    sogl.add(test);
                    sogl.add(" ");
                }
            }
        }
            for(Object gls : glas) {
                System.out.print(gls);
            }
            System.out.println();
            for (Object sgl : sogl) {
                System.out.print(sgl);
            }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}