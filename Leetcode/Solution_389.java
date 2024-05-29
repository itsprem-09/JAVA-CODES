class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < s.length(); i++) {
            sum1 += s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            sum2 += t.charAt(i);
        }
        return (char) (sum2 - sum1);
    }
}

// Optimised Solution
// class Solution {
//     public static char findTheDifference(String s, String t) {
//         char result=0;

//         for(int i=0;i<s.length();i++){
//             result ^=s.charAt(i);
//         }

//         for(int i=0;i<t.length();i++)
//         {
//             result ^= t.charAt(i);
//         }
//         return result;
//     }
// }

public class Solution_389 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findTheDifference("", "y"));
    }
}
