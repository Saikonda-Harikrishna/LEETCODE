import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {

       Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++)
        {
            int required = target - nums[i];
            if(map.containsKey(required))
            {
                int[] arr = {map.get(required),i};
                return arr;
            }
            map.put(nums[i],i);
        }
        return null;
    }
} 