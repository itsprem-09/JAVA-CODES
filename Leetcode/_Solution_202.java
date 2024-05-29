class Solution{
    public boolean isHappy(int n) {
        int sum = 0;
        int temp;
        while (sum != 1) {
            while (n!=0) {
                temp = n%10;
                sum += temp*temp;
                n = n/10;
            }
            if (n == 0) {
                n = sum;
                sum = 0;
                continue;
            }
        }
        if (sum == 1) {
            return true;
        }
        else{
            return false;
        }
    }
}

public class Solution_202 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isHappy(19));
    }
}
