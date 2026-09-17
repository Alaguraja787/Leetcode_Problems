class Solution {
    public int maxVowels(String s, int k) {
        int left =0;
        int right =0;
        String word = "";
        int count =0;
        int ans = 0;
        while (right<k){
            word +=s.charAt(right);
            right++;
        }
        
        for (int i=0; i<k;i++){
            char w = word.charAt(i);
            if ("aeiouAEIOU".indexOf(w) != -1) {
                count++;
            }
        }
        ans = count;
        while (right<s.length()){
            word = word.substring(1);
            char le = s.charAt(left);
            if ("aeiouAEIOU".indexOf(le) != -1){
                count--;
            }
            word +=s.charAt(right);
            char ri = s.charAt(right);
            if ("aeiouAEIOU".indexOf(ri) != -1){
                count++;
            }
            left++;
            right++;
            ans = Math.max(ans, count);
        }
        return ans;

    }
}