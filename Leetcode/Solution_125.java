class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        s = s.trim().toLowerCase();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                str = str + s.charAt(i);
            }
        }
        for (int i = 0; i < str.length()/ 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

public class Solution_125 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome("race a car"));
    }
}
