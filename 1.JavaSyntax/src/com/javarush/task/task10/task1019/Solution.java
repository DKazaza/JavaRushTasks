package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        String bfr;
        while (!(bfr=reader.readLine()).isEmpty())
        {
            int id = Integer.parseInt(bfr);
            String name = reader.readLine();
            map.put(name, id);
        }
        for (Map.Entry<String, Integer> cur: map.entrySet()
        ) {
            System.out.println(cur.getValue() + " " + cur.getKey());
        }

    }
}
