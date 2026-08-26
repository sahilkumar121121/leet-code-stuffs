class Solution {
    public int[] plusOne(int[] digits) {

        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9,
            // simply add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9,
            // make it 0 and carry 1 to the left
            digits[i] = 0;
        }

        // If we reach here,
        // every digit was 9.
        //
        // Example:
        // [9,9,9] -> [1,0,0,0]

        int[] result = new int[digits.length + 1];

        result[0] = 1;

        return result;
    }
}