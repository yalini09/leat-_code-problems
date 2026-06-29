class Solution {
    public int findGCD(int[] nums) {
       Arrays.sort(nums);
       int remind;
       while (nums[nums.length-1] % nums[0] != 0) {
       if(nums[nums.length-1]%nums[0]==0){
        return nums[0];}
       else{
        while (nums[nums.length-1] % nums[0] != 0) {
        remind=nums[nums.length-1]%nums[0];
        nums[nums.length-1]=nums[0];
        nums[0]= remind;
       }
       
       }
    
    }
    return nums[0];
}
}
