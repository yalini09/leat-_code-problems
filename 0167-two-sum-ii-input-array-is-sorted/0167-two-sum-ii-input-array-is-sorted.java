class Solution {
    public int[] twoSum(int[] num, int target) {
      int i,j ;
      int start = 0; 
      int end = num.length-1;
      int [] A=new int[2];
      while(start<end){
        int sum = num[start]+num[end];
        if(target == sum)
        {
            A[0]=start+1;
            A[1]=end+1;
            return A;
        }
        else if (sum<target){

            start++;
        }
        else{
            end--;
        }
      }
      return A;
       
    }
}