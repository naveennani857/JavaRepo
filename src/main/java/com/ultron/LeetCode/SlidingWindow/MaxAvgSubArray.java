package com.ultron.LeetCode.SlidingWindow;

import java.util.Arrays;

public class MaxAvgSubArray {
    public static void main(String[] args) {
        // int x = Integer.MIN_VALUE;
        // System.out.println(x);
         int[] input = {1,12,4,-5,-7,9,6};
        //int[] input = {2,2,2,2,2,2,2,2};
        int k = 4;

        findMaxSubArray(input,k);  // Brute- Force approach
    }

    private static void findMaxSubArray(int[] input, int k) {   //Brute-Force approach --> checking every array of size k
        int maxSum = Integer.MIN_VALUE;
        int n = input.length;
       int[] outArr = new int[k];
        for(int i =0; i<= n - k; i++){
            int sum = 0;
            for(int j = i; j< i+k; j++){
                sum+=input[j];
            }
            maxSum = Math.max(maxSum, sum);
            
            int temp=0;
            if(maxSum == sum){
                for(int l = i; l<i+k;l++){
                    System.out.print(l);
                    outArr[temp] = input[l];temp++;
                }
            }
        }
        System.out.println(Arrays.toString(outArr));
        System.out.println("the average of the max average sub array : "+maxSum/k);
    }

}
