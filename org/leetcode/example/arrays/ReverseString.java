/*

                344. Reverse String

Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

*/

package leetcode.example.arrays;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(arr);
    }

    // Logic Method
    public void reverseString(char[] s) {
        int last = s.length-1;
        int first = 0;
        while(first<=last){
            char temp = s[first];
            s[first++]= s[last];
            s[last--]=temp;
        }
        // just to get output in terminal
        System.out.println("Answer :"+ Arrays.toString(s));
    }

}
