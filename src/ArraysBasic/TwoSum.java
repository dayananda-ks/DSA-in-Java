import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int matchNum = target - nums[i];
            if (map.containsKey(matchNum)) {
                return new int[]{map.get(matchNum), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Output: " + Arrays.toString(result));
    }
}