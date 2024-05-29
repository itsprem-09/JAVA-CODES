// Easy Solution
// class Solution {
//     public int[] countBits(int n) {
//         int[] ans = new int[n+1];
//         for (int i = 0; i <= n; i++) {
//             String str = Integer.toString(decimalToBinary(i));
//             for (int j = 0; j < str.length(); j++) {
//                 if (str.charAt(j) == '1') {
//                     ans[i] = ans[i] + 1;
//                 }
//             }
//         }
//         return ans;
//     }

//     public static int decimalToBinary(int N) {

//         // To store the binary number
//         int B_Number = 0;
//         int cnt = 0;
//         while (N != 0) {
//             int rem = N % 2;
//             double c = Math.pow(10, cnt);
//             B_Number += rem * c;
//             N /= 2;
//             // Count used to store exponent value
//             cnt++;
//         }

//         return B_Number;
//     }
// }

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {

            ans[i] = Bits(i);

        }
        return ans;
    }

    public int Bits(int n) {
        int c = 0;
        while (n != 0) {
            c += (n & 1);
            n = n >> 1;
        }
        return c;
    }
}

public class Solution_338 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] ans = s.countBits(5);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
