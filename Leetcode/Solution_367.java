class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int left = 1;
        int right = num/2;
        while (left <= right) {
            int mid = (left + right)/2;
            long square = (long) mid * mid;
            if (square == num) {
                return true;
            }
            else if (square < num) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}

public class Solution_367 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPerfectSquare(16));
    }
}
