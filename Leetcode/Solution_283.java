class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }        
    }
}


// class Solution {
//     public void moveZeroes(int[] nums) {
//         for (int i = 0; i < nums.length-1; i++) {
//             for (int j = i+1; j < nums.length; j++) {
//                 if (nums[i] == 0) {
//                     int temp = nums[i];
//                     nums[i] = nums[j];
//                     nums[j] = temp;
//                 }
//             }
//         }
//     }
// }

public class Solution_283 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 0 };
        s.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
