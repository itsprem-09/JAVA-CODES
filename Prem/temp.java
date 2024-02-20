class Solution {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int f=0;
            for (int j = 0; j < nums.length; j++) {
                if(i==nums[j]) f=1;
            }
            if(f==0) 
            return i;

        }
        return nums.length;
    }
}

public class temp{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(s1.missingNumber(nums));
        
    }
}