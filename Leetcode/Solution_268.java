import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int j = 0,i;
        if (nums[0] != 0) {
           return 0;
        }
        for (i = nums[0]; i < nums[nums.length - 1]; i++) {
            if (nums[j] == i) {
                j++;
            } else {
                return i;
            }
        }
        return i+1;
    }
}


public class Solution_268 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 0, 1};
        System.out.println(s.missingNumber(nums));
    }
}
