import java.util.*;

class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        int maxcount = 0;

        Set<Character> vowels = new HashSet<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // Step 1: Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }

        // First window's count is the maximum initially
        maxcount = count;

        // Step 2: Slide the window
        for (int j = k; j < s.length(); j++) {

            // Remove the character leaving the window
            if (vowels.contains(s.charAt(j - k))) {
                count--;
            }

            // Add the new character entering the window
            if (vowels.contains(s.charAt(j))) {
                count++;
            }

            // Update maximum
            maxcount = Math.max(maxcount, count);
        }

        return maxcount;
    }
}