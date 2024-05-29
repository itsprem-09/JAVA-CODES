class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
            if () {
                
            }
            for (int j = 0; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
        }
        return (count == s.length());
    }
}

public class Solution_392 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isSubsequence("acb", "ahbgdc"));
    }
}
