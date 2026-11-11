// https://leetcode.com/problems/two-sum/description/

package easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day02 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            int temp = 0;
            int idx = 0;
            for (int num : nums){
                temp = target - num;
                if (map.containsKey(temp)){

                    return new int[]{map.get(temp), idx};

                }
                map.put(num, idx);
                idx++;
            }
            return new int[]{};
        }
    }
}


//codex가 추천한 방법
//for (int i = 0; i < nums.length; i++) {
//int temp = target - nums[i];
//
//    if (map.containsKey(temp)) {
//        return new int[]{map.get(temp), i};
//        }
//
//        map.put(nums[i], i);
//}