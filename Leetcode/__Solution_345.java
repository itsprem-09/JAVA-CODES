class Solution {
    public String reverseVowels(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) != 'a' || s.toLowerCase().charAt(i) != 'e' || s.toLowerCase().charAt(i) != 'i' || s.toLowerCase().charAt(i) != 'o' || s.toLowerCase().charAt(i) != 'u') {
                result += s.charAt(i);
            }
            else{
                for (int j = (s.length()-2+i); j >= 0; j--) {
                    if (s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e' || s.toLowerCase().charAt(i) == 'i' || s.toLowerCase().charAt(i) == 'o' || s.toLowerCase().charAt(i) == 'u') {
                        result += s.charAt(j);
                        break;
                    }
                }
            }
        }
        return result;
    }
}

public class __Solution_345 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseVowels("hello"));
    }
}
