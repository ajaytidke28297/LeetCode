package Easy;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        if(nums.length < 2)
            return null;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int [] {i, map.get(compliment)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("NO two numbers add up to the target");
    }
}