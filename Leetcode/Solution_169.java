import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
}

public class Solution_169 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        Solution s = new Solution();
        System.out.println(s.majorityElement(nums));
    }
}
