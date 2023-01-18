package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> tabel = new HashMap<>();
        tabel.put("Петров1", 1230);
        tabel.put("Петров2", 1203);
        tabel.put("Петров3", 1023);
        tabel.put("Петров4", 523);
        tabel.put("Петров5", 13);
        tabel.put("Петров6", 1523);
        tabel.put("Петров7", 1123);
        tabel.put("Петров8", 230);
        tabel.put("Петров9", 12543);
        tabel.put("Петров10", 1423);
        return tabel;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> azaza : copy.entrySet()){
            if(azaza.getValue() < 500)
            {
                map.remove(azaza.getKey());
            }

        }
    }

    public static void main(String[] args) {

    }
}