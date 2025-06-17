package com.ultron.LeetCode;

public class FindProfitFromBuyAndSell {
   public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,4,7};

        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

       for(int price : prices) {
            minPrice = Math.min(price, minPrice);
            profit = Math.max(profit,price-minPrice);
       }
       System.out.println(minPrice);
       System.out.println(profit);
   }
}
