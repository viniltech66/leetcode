package com.leetcode.java;

import java.util.*;
import java.lang.Character;

/*
Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 */
public class Isomorphic {

    public static void main(String[] args){

        String str1 = "stenographics";
        String str2 = "logarithmsxox";
        System.out.println("Is "+str1 +" and "+str2 +" are Isomorphic? "+isIsomorphic2(str1, str2));
    }

    public static boolean isIsomorphic1(String s, String t) {

        if(s==null || t==null || s.length()!=t.length()) {
            return false;
        }

        Map<Character,Character> charMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char char_str1=s.charAt(i);
            char char_str2=t.charAt(i);
            if(charMap.containsKey(char_str1)){
                if(charMap.get(char_str1)!=char_str2)
                    return false;

            }else{
                if(charMap.containsValue(char_str2)){
                    return false;
                }
                charMap.put(char_str1,char_str2);
            }
        }

        return true;
    }



        private static String transformString(String s) {
            Map<Character, Integer> indexMapping = new HashMap<>();
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < s.length(); ++i) {
                char c1 = s.charAt(i);

                if (!indexMapping.containsKey(c1)) {
                    indexMapping.put(c1, i);
                }

                builder.append(Integer.toString(indexMapping.get(c1)));
                builder.append(" ");
            }
            return builder.toString();
        }

        public static boolean isIsomorphic2(String s, String t) {
            return transformString(s).equals(transformString(t));
        }

}
