class Solution {
    public int lengthOfLongestSubstring(String s) {
     int i,j;
     
     
     int maxLength = 0;
     for(i=0;i<s.length();i++){
         HashMap<Character,Integer> set = new HashMap();
        for(j = i;j<s.length();j++){
            var ch = set.get(s.charAt(j));
            if(ch!=null){
                break;
            }
            else{
                set.put(s.charAt(j),1);
                maxLength = Math.max(maxLength,j-i+1);
            }
            
            
            
        }
     }   
     return maxLength;
    }
}