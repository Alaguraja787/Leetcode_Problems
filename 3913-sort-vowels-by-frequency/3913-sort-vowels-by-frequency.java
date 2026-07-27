import java.util.*;

class Solution {
    public String sortVowels(String s) {
        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u');

        Map<Character, Integer> freq = new HashMap<>();
        List<Character> vowels = new ArrayList<>();

        // Count frequency and store first occurrence order
        for (char ch : s.toCharArray()) {
            if (!vowelSet.contains(ch)) continue;

            if (!freq.containsKey(ch)) {
                vowels.add(ch);      // First occurrence
            }
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Sort by frequency descending
        // Stable sort keeps first occurrence order when frequencies are equal
        vowels.sort((a, b) -> freq.get(b) - freq.get(a));

        char[] ans = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < ans.length; i++) {
            if (!vowelSet.contains(ans[i])) continue;

            char ch = vowels.get(idx);
            ans[i] = ch;

            freq.put(ch, freq.get(ch) - 1);

            if (freq.get(ch) == 0) {
                idx++;
            }
        }

        return new String(ans);
    }
}