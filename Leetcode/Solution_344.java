class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}

public class Solution_344 {
    public static void main(String[] args) {
        Solution s = new Solution();
        char[] s1 = {'h','e','l','l','o'};
        s.reverseString(s1);
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i]);
        }
    }
}
