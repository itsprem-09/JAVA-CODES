class Solution {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length-1;
        int low = 0;
        int mid = (high+low)/2;
        while (high >= low) {
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                high = mid - 1;
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            mid = (high+low)/2;
        }
        return low;
    }
}

public class Solution_35 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,3,5,6};
        System.out.println(s.searchInsert(nums, 5));
    }
}
