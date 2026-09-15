class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        // Customers who are already happy
        int happy = 0;

        // Customers we can save using the technique
        int window = 0;

        // Maximum customers we can save
        int maxWindow = 0;

        // Step 1: Find customers who are already happy
        for (int i = 0; i < customers.length; i++) {

            if (grumpy[i] == 0) {
                happy += customers[i];
            }
        }

        // Step 2: First window
        for (int i = 0; i < minutes; i++) {

            if (grumpy[i] == 1) {
                window += customers[i];
            }
        }

        maxWindow = window;

        // Step 3: Slide the window
        for (int i = minutes; i < customers.length; i++) {

            // Add the new customer
            if (grumpy[i] == 1) {
                window += customers[i];
            }

            // Remove the customer leaving the window
            if (grumpy[i - minutes] == 1) {
                window -= customers[i - minutes];
            }

            // Keep the maximum saved customers
            maxWindow = Math.max(maxWindow, window);
        }

        // Already happy + maximum saved
        return happy + maxWindow;
    }
}