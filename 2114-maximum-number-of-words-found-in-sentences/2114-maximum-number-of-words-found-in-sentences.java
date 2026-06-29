class Solution {
    public int mostWordsFound(String[] sentences) {
       
       int max = 0;
       for(String word : sentences){
       String[] A= word.split(" ");
        int len = A.length;
       max = Math.max(max,len);
       }
       return max; 
       }
      
    }
