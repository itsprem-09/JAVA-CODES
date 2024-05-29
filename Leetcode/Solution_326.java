class Solution {
    public boolean isPowerOfThree(int n) {

        if (n == 1){return true;}
        if (n%3 != 0 || n == 0) {
            return false;
        }
        return isPowerOfThree(n/3); 

    }
}

// class Solution {
//     public boolean isPowerOfThree(int n) {
//         for (int i = 0; i < 31; i++) {
//             if (n == Math.pow(3, i)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

public class Solution_326 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPowerOfThree(27));
    }
}
