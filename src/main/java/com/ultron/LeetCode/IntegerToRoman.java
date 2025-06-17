package com.ultron.LeetCode;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num=2359;
        String result = intToRoman(num);
        System.out.println(result);
    }
    public static String intToRoman(int num){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String romanString = "";

        for(int i =0; i< values.length;i++){
            while(num >= values[i]){
                romanString +=roman[i];
                num-=values[i];
            }
        }
        
        return romanString;
    }
}
