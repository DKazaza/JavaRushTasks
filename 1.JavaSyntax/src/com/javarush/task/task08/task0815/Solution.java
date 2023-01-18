package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> person = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            person.put("Family_"+i, "Name_"+i);
        }
        return person;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String s: map.values()) {
            if(s.equals(name)) {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        for (String xx: map.keySet()) {
            if(xx.equals(lastName)) {
               return 1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {

    }
}
