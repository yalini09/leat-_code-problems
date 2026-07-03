class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int targetSum = k * threshold;
        int currentSum = 0;
        int i = 0;
        while (i < k) {
            currentSum += arr[i];
            i++;
        }

        if (currentSum >= targetSum) count++;
        int right = k;
        while (right < arr.length) {
            currentSum += arr[right] - arr[right - k];
            
            if (currentSum >= targetSum) {
                count++;
            }
            right++;
        }
        
        return count;
    }
}