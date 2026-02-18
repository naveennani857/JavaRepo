package org.leetcode.easy;

import java.util.Stack;

public class ValildParenthesis_20 { // Leetcode problem number 20
    public static void main(String[] args) {
        //stackDataStructure();
        String str = "()[]{}]";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s){
        Stack<Character> strings = new Stack<>();

        //Looping through the String
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // If the start of the string is opening brace add it to the stack
            if(ch == '(' || ch == '{' || ch == '['){
                strings.add(ch);
            }
            else {
                if(strings.size() ==0){
                    // if is not the opening brace return false directly
                    //If nothing added then the size will be 0;
                    return false;
                }
                //If the closing is for the same parenthesis remove the opening one. so that you can move on further
                if(strings.peek() == '(' && ch == ')' || strings.peek() == '{' && ch == '}' || strings.peek() == '[' && ch == ']'){
                    strings.pop();
                }
                else{ //If the closing bracket is not same as the opening one at the last item present in the stack then return false
                    return false;
                }
            }
        }
        //Final check if opening and closings are in a good way then everything will cut out then the size will be 0
        //if not the size will  not be 0 and we will get the false output from here
        return strings.size()==0;
    }
    public static void stackDataStructure(){
        //Stack is a Linear Data Structure which follows LIFO Principle
        Stack<String> strs = new Stack<>();
        strs.add("aergsdf");  // adds element to the top
        strs.add("grefds");
        strs.add("vdf hcbe");
        System.out.println(strs);
        System.out.println(strs.pop()); // deletes the top element
        System.out.println(strs.peek()); // prints the last element without deleting it
        System.out.println(strs.search("grefds"));  // used to search for the index of element. returns -1 if it's not present
    }
}
