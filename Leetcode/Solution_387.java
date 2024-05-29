class Solution {
    public int firstUniqChar(String s) {
        char arr[] = s.toCharArray();
        int freq[] = new int[26];
        for(int i =0;i<arr.length;i++){
            char ch = arr[i];
            freq[ch-'a']++;
        }
        for(int i =0;i<arr.length;i++){
            char ch = arr[i];
            if(freq[ch-'a']==1){
                return i;
            }
        }
        return -1;

    }
}

// class Solution {
//     public int firstUniqChar(String s) {
//      int arr[]=new int[26];
//      for(int i=0;i<s.length();i++){
//          char ch=s.charAt(i);
//          arr[ch-'a']++;
//      }
//      for(int i=0;i<s.length();i++){
//          char ch=s.charAt(i);
//          if(arr[ch-'a']==1){
//              return i;
//          }
//      }
//      return -1;
//     }
// }

public class Solution_387 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.firstUniqChar("aabb"));
    }
}
