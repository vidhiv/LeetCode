/*

Problem 5. Longest Palindromic Substring
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

*/
import java.lang.*; 
import java.util.*; 
class LongestPalindrome {
    public String longestPalindrome(String s) {
        boolean status = checkPalindrome(s);
        String str = s;
        int len = s.length();
        while (!status) {
            str = "";
            len = len - 1;
            int i = 0;
            while (!status && (i+len) <= s.length()) {
                str = s.substring(i,i+len);
                status = checkPalindrome(str);
                i++;
            }
        }
        return str;
    }

    boolean checkPalindrome(String s) {
        char[] s1 = s.toCharArray();
        int i=0, j=s1.length-1;
        while(i<j && s1[i] == s1[j]) {
            i++;j--;
        }
        if(i >= j){
            return true;
        }else{
            return false;
        }
    }
}
