class Solution {
    public boolean squareIsWhite(String c) {
        int num = 0;
        char[] arr = c.toCharArray(); 
        for (char word : arr){
            
             num = num + word ;
             }
            if(num%2==0) return false;
            else return true;
            
        

        }   
    }
