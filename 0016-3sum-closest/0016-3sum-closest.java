import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        // Sort the array
        Arrays.sort(nums);

        // Start with the first possible 3 elements
        int closest = nums[0] + nums[1] + nums[2];

        // i = first element
        for (int i = 0; i < nums.length - 2; i++) {

            // Two pointers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                // Find the sum of 3 elements
                int sum = nums[i] + nums[left] + nums[right];

                // Check if this sum is closer
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // If sum is smaller, increase it
                if (sum < target) {
                    left++;
                }

                // If sum is larger, decrease it
                else if (sum > target) {
                    right--;
                }

                // Exact answer
                else {
                    return sum;
                }
            }
        }

        return closest;
    }
}