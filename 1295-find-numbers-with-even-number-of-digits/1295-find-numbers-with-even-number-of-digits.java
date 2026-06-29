class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int div = 1;
        int n = nums.length;
        for (int temp :nums){
            int digits = 0;
            while(temp>0){
                temp = temp /10;
                digits ++;}
                if(digits%2==0) count++;
            }
            return count;

        }
    }
    
