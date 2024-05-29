class Solution {
    public int addDigits(int num) {
        int ans = 0;
        while (num > 0) {
            ans += num%10;
            num = num/10;
            if (num == 0 && ans >= 10) {
                num = ans;
                ans = 0;
            }
            if (num == 0 && ans <10) {   
                break;
            }
        }
        return ans;
    }
}

public class Solution_258 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.addDigits(0));
    }
}
