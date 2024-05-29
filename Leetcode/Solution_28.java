class Solution{
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

public class Solution_28{
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "sadbutsad";
        String str1 = "sad";
        System.out.println(s.strStr(str,str1));
    }
}