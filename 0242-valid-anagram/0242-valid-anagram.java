class Solution {
    public boolean isAnagram(String s, String t) {
      int [] freq = new int [26];
      char[] a = s.toCharArray();
      char[] b= t.toCharArray();
      for(int ch : s.toCharArray())
            freq[ch-'a']++;
      for(int ch : t.toCharArray())
            freq[ch-'a']--;
      for(int val : freq){
        if(val!=0)return false;

      }
      return true ;

      

    }
}