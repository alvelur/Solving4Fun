package org.example;

public class Recursion1 {
    public static void main(String[] args) {

    }

    /* https://codingbat.com/prob/p108997 */

    public boolean array6(int[] nums, int index) {

        if(index >= nums.length) return false;
        if (nums[index] == 6) return true;
        return array6(nums, index +1);
    }
}
