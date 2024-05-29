// Better Solution
// class Solution {
//     public int[] twoSum(int[] nums, int target) {   
//         for (int i=1; i < nums.length; i++) {
//             for (int j=i; j < nums.length; j++) {
//                 if (nums[j]+nums[j - i] == target){
//                     return new int[] {j, j - i};
//                 }
//             }
//         }
//         return null;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}

public class Solution_1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 7, 11, 15};
        int[] result = s.twoSum(nums, 9);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
