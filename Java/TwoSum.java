package Java;

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int more = target - curr;
            if (map.containsKey(more)) {
                ans[0] = map.get(more);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
