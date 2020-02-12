/*
Problem 3 - Longest Substring Without Repeating Characters


Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
             
*/

class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        char []arr = s.toCharArray();
        String substr = "";
        int max = 0;
        HashSet <Character> hs = new HashSet <> ();
        for(int i = 0; i < arr.length; i++){
            if (hs.contains(arr[i])) {
                if (substr.length() > max) {
                    max = substr.length();
                }
                if (substr.indexOf(arr[i]) > -1) {
                    char newarr[] = substr.toCharArray();
                    int y = 0;

                    while (newarr[y] != arr[i]){
                        y++;
                    }
                    if(newarr[y] == arr[i]) {
                        y++;
                    }
                    substr = "";
                    while(y < newarr.length) {
                        substr += newarr[y];
                        y++;
                    }
                }
                substr += arr[i];
                if (substr.length() > max) {
                    max = substr.length();
                }
            } else {
                substr += arr[i];
                hs.add(arr[i]);
            }
        }
        if (substr.length() > max) {
            max = substr.length();
        }
        return max;
    }
}
