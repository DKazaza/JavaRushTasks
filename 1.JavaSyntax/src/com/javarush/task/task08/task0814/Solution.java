package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> kucha = new HashSet<>();
        kucha.add(1);
        kucha.add(2);
        kucha.add(3);
        kucha.add(4);
        kucha.add(5);
        kucha.add(6);
        kucha.add(7);
        kucha.add(8);
        kucha.add(9);
        kucha.add(10);
        kucha.add(11);
        kucha.add(12);
        kucha.add(13);
        kucha.add(14);
        kucha.add(15);
        kucha.add(16);
        kucha.add(17);
        kucha.add(18);
        kucha.add(19);
        kucha.add(20);
        return kucha;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Set<Integer> copy = new HashSet<>(set);
        for (Integer azaza : copy){
            if (azaza>10){
                set.remove(azaza);
            }
        }
        return set;

    }

    public static void main(String[] args) {

    }
}
