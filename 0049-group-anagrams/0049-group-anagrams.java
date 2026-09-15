import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (used[i]) {
                continue;
            }

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    used[j] = true;
                }
            }

            result.add(group);
        }

        return result;
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}