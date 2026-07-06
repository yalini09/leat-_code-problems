class Solution {
    public int pivotIndex(int[] nums) {
        int total= 0;
        
        int right_sum;
        for(int num : nums){
            
          total = total+num;
          }
          int left_sum =0;
          for(int i = 0;i<nums.length;i++){
          
          right_sum = total- left_sum - nums[i];
          if(left_sum == right_sum){
            return i;
           
          }
          left_sum += nums[i];
         
          
        }
        return -1;
        

    }
}