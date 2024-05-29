class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            if (n == Math.pow(2, i)) {
                return true;
            }
        }
        return false;
    }
}

public class Solution_231 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPowerOfTwo(0));
    }
    
}