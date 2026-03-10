class Solution {
    public boolean isAnagram(String s, String t) 
    {
        int freq[]=new int[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        for(char x:s.toCharArray())
        {
            freq[x-'a']++;
        }
        for(char c:t.toCharArray())
        {
            freq[c-'a']--;
        }
        for(int a:freq)
        {
            if(a>0) return false;
        }
        return true;
    }
}

/* Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints: */

s and t consist of lowercase English letters.
