class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()<1){
            return 0;
        }
        int max_length = 0;
        for (int i=0; i<s.length(); i++){
            HashSet<Character> set = new HashSet<>();
            for (int j=i; j<s.length(); j++){
                if (set.contains(s.charAt(j))){
                    break;
                }
                else{
                    set.add(s.charAt(j));
                    max_length = Math.max(max_length, set.size());
                }
            }
            
        }
        return max_length;

    }
}