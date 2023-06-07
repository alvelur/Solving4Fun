package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {10,8,1,2};
        int target = 9;

        int [] result = twoSumBrute(nums, target);
        int [] betterResult = twoSum(nums, target);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(betterResult));
    }

    /* First Solution to problem https://leetcode.com/problems/two-sum/ it should be noted that this solution is
    O(n^2) */
    public static int[] twoSumBrute(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(target - nums[i] == nums[j] && j != i) return new int[]{i,j};
            }
        }
        return new int[] {0,0};
    }

    /* This approach is quite better since it is O(n) */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int[] myIndexArray = new int[]{0, 0};
        for (int i = 0; i <= nums.length - 1; i++) {
            int temp = target - nums[i];
            if (myMap.containsKey(temp)) {
                myIndexArray[0] = myMap.get(temp);
                myIndexArray[1] = i;
                return myIndexArray;
            } else {
                myMap.put(nums[i], i);
            }
        }
        return null;
    }
}


