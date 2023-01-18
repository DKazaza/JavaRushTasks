package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stkn = new StringTokenizer(query, delimiter);
        String[] ss=new String[stkn.countTokens()];
        int i = 0;
        while (stkn.hasMoreTokens()){
            ss[i]=stkn.nextToken();
            i++;
        }
        return ss;
    }
}
