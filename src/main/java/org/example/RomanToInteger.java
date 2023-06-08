package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
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

        int i = 1;
        while(i < s.length()){

            if(myMap.get(s.charAt(i-1)) < myMap.get(s.charAt(i))){
                count += myMap.get(s.charAt(i)) - myMap.get(s.charAt(i-1));
            }
             else if(myMap.get(s.charAt(i-1)) >= myMap.get(s.charAt(i))) {
                count += myMap.get(s.charAt(i - 1)) + myMap.get(s.charAt(i));
            }

             if(i + 2 >= s.length()){
                 count+= myMap.get(s.charAt(i+1));
                 break;
             }
                 i = i + 2;
             }

        return count;
    }
}


