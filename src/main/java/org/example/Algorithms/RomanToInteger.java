package org.example.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MMCDXXV";
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {
        int count = 0;

        Map<Character,Integer > myMap = new HashMap<>();
        myMap.put('I', 1);
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C', 100);
        myMap.put('D', 500);
        myMap.put('M', 1000);

        int i = 0;
        while(i < s.length()) {
            if (s.length() == 1) {
                return myMap.get(s.charAt(i));
            }
                if(i + 1 >= s.length()){
                    count += myMap.get(s.charAt(i));
                    return count;
                }else{
                    if(myMap.get(s.charAt(i)) >= myMap.get(s.charAt(i + 1))){
                        count += myMap.get(s.charAt(i));
                        i = i + 1;
                    } else {
                        count += myMap.get(s.charAt(i+1)) - myMap.get(s.charAt(i));
                        i = i +2;
                    }
                }
            }
        return count;
    }
}


