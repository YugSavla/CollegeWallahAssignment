public class Anagram {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        if(n != t.length()){
            return false;
        }
        int arr[]=new int[26];
        int brr[]=new int[26];
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            int val1=(s.charAt(i)-97);
            int val2=(t.charAt(i)-97);
            arr[val1]++;brr[val2]++;

        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=brr[i]){
                return false;
            }
        }
        return true;
    }
}

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         char[] sChars = s.toCharArray();
//         char[] tChars = t.toCharArray();
        
//         Arrays.sort(sChars);
//         Arrays.sort(tChars);
        
//         return Arrays.equals(sChars, tChars);
//     }
// }