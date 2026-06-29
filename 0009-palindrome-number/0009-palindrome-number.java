class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        long div =1;
        long rev =0;
         while(div<=x){
            long id =x%(div*10)/div;
            rev=rev*10+id;
            div=div*10;
            
         }
          return (rev==x)?true:false;
    }
}