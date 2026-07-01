class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int i,j ;
      int [] A=new int[2];
      for(i = 0;i<numbers.length-1;i++ ){
        for(j = i+1;j<numbers.length;j++){
            if(numbers[i]+numbers[j]==target){
               A[0]= i+1;
               A[1]=j+1;
               return A;   
            }
        }
      } 
      return A; 
      
    }
}