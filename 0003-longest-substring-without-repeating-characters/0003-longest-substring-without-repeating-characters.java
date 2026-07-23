class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()<1){
            return 0;
        }
        int max_count = 1;
        for (int i=0;i<s.length(); i++){
            int count = 1;
            String res ="";
            res += s.charAt(i);
            int j=i+1;
            while (j < s.length()) {

                if (!res.contains(String.valueOf(s.charAt(j)))) {
                    res += s.charAt(j);
                    count++;
                } else {
                    break;
                }

                j++;
            }
            max_count = Math.max(count, max_count);
            count = 1;
        }
        return max_count;
    }
}