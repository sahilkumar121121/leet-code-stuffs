class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int sum = 0;
        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // Check first window
        if (sum >= k * threshold) {
            count++;
        }

        // Slide the window
        for (int right = k; right < arr.length; right++) {

            // Add new element
            sum += arr[right];

            // Remove element that left the window
            sum -= arr[right - k];

            // Check current window
            if (sum >= k * threshold) {
                count++;
            }
        }

        return count;
    }
}