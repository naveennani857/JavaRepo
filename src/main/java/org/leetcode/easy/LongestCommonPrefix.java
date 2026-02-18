package org.leetcode.easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lc = new LongestCommonPrefix();
        String[] strs = {"flowrr","hloorr","fligrrht"};
        //String[] strs = new String[1]; //-- will get null as output cause you created array but didn't initialize it
        System.out.println(lc.longestPrefix(strs));
    }
    public String longestPrefix(String[] strings){
        if(strings == null || strings.length == 0) return "not present";

        for (int i = 0; i< strings[0].length();i++){
            char c = strings[0].charAt(i);

            for (int j = 1; j < strings.length; j++) {
                if(i == strings[j].length() || strings[j].charAt(i) != c){
                    return strings[0].substring(0,i);
                }
            }
        }
        return strings[0];
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) while (
                strs[i].indexOf(prefix) != 0
        ) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }
}
