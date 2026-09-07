class Solution {

    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Store the maximum sum
        int maxSum = sum;

        int end = k;

        // Sliding window
        while (end < nums.length) {

            // Add new element
            sum += nums[end];

            // Remove old element
            sum -= nums[end - k];

            // Update maximum sum
            maxSum = Math.max(maxSum, sum);

            end++;
        }

        // Calculate maximum average
        return (double) maxSum / k;
    }
}