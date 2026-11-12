package easy;

import java.util.HashMap;

// 242. Valid Anagram
// https://leetcode.com/problems/valid-anagram/
public class day03 {
    public static void main(String[] args) {
        class Solution {
            public boolean isAnagram(String s, String t) {
                if (s.length() != t.length()) {
                    return false;
                }

                HashMap<Character, Integer> result = new HashMap<>();
                for (char sch : s.toCharArray()) {
                    result.put(sch, result.getOrDefault(sch, 0) + 1);
                }

                for (char tch : t.toCharArray()) {
                    result.put(tch, result.getOrDefault(tch, 0) - 1);
                }

                for (char key : result.keySet()) {
                    if (result.get(key) != 0) {
                        return false;
                    }
                }
                return true;
            }
        }
    }
}
