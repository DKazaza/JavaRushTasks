package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sto=number/100;
        int des=(number-sto*100)/10;
        int ed=number-sto*100-des*10;
        int itog=sto+des+ed;
        return itog;
    }
}