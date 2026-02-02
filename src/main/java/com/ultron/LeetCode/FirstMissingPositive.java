package com.ultron.LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] input = { 6, 2, 1, 3, 5, 4 };

        int output = findMissingsmallestPositive(input);
        System.out.println(output);
    }

    private static int findMissingsmallestPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
           // int correctIndex = nums[i] - 1;
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                System.out.println(Arrays.toString(nums)+" "+i);
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
                
            }
        }
        for(int i =0; i<n;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }

    private static int findMissingsmallestPositive1(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int x : nums) {
            if (x > 0)
                numSet.add(x);
        }
        int output = 1;
        while (true) {
            if (!numSet.contains(output)) {
                return output;
            }
            output++;
        }
    }
}
