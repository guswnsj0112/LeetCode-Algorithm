import java.util.HashMap;
import java.util.Map;

// 217번. https://leetcode.com/problems/two-sum/description/
public class day01 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, num);
        }
        return false;
    }
}

/*
GPT가 알려준 가벼운 풀이
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
 */