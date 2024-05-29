class Solution {
    public int specialArray(int[] nums) {
        for (int i = 1; i <= 1000; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    count++;
                }
            }
            if (i == count) {
                return i;
            }
        }
        return -1;
    }
}

public class Solution_1608 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,4,3,0,4};
        System.out.println(s.specialArray(nums));
    }
}
