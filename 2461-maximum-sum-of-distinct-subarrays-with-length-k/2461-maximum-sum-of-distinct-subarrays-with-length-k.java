import java.util.HashMap;
import java.util.Map;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;
   
        Map<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
            if (i >= k) {
                int leftElement = nums[i - k];
                currentSum -= leftElement;
                counts.put(leftElement, counts.get(leftElement) - 1);
                if (counts.get(leftElement) == 0) {
                    counts.remove(leftElement);
                }
            }
            if (i >= k - 1 && counts.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}