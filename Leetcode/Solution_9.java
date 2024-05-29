class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        for (int i = 0; i < str.length()/ 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

// class Solution {
//     public boolean isPalindrome(int x) {
//         int sum = 0, target =x;;
//         while(x>0){
//             int temp = x%10;
//             x=x/10;
//             sum = sum*10 + temp;
//         }
//     return sum==target ;
//     }
// }

public class Solution_9 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(-121));
    }
}
