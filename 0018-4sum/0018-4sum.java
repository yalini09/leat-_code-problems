class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> finalAns = new ArrayList<>();
        HashSet<List<Integer>> h1 = new HashSet<>();
        Arrays.sort(nums);
        int start,end,i,j;
        for( i = 0;i<nums.length-2;i++){
          for(j= i+1;j<nums.length-1;j++){
            start = j+1;
            end = nums.length-1;
            while(start<end){
                long sum = (long)nums[i]+nums[j]+nums[start] +nums[end];
                if(target==sum){
                      List<Integer> l1 = new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    l1.add(nums[start]);
                    l1.add(nums[end]);
                    h1.add(l1);
                    start++;
                    end--; }
                else if(sum<target){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
    
    }
       for(var it:h1){
        finalAns.add(it);
       }
       return finalAns;
  }

 }
        