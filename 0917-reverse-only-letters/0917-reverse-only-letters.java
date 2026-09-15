class Solution {
    public String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left if it is not a letter
            if (!Character.isLetter(arr[left])) {
                left++;
            }

            // Move right if it is not a letter
            else if (!Character.isLetter(arr[right])) {
                right--;
            }

            // Both are letters → swap
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}
