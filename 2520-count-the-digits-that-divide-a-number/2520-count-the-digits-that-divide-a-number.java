class Solution {
    public int countDigits(int num) { 
         
         int div =1;
         int cnt=0;
       while(div<=num){
          int id=num%(div*10)/div;
          if(num%id==0)
           cnt++;
           div*=10;
       }
       return cnt;









































         
    }
}