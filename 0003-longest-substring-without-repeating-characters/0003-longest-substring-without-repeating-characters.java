class Solution {
    public int lengthOfLongestSubstring(String s) {
     int left= 0,right= 0;
     int maxLength = 0;
     HashMap<Character,Integer> set = new HashMap(); 
     while (right < s.length())
     {
        while(left < right &&set.containsKey(s.charAt(right))==true)
        {
            set.remove(s.charAt(left));
            left++;
          }
                maxLength = Math.max(maxLength,right-left+1);
                set.put(s.charAt(right),1);
                right ++;
            }
             return maxLength;
     }   
    
    }
