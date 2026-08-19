class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int maxlen = 0;
        int i=0;
        int j=0;
        while (j<nums.length){
            if (nums[j]==0){
                count++;
            }

            while(count==2){
                if (nums[i]==0){
                    count--;
                }
                i++;
            }
            maxlen = Math.max(maxlen, j-i);
            j++;

        }
        return maxlen;
        
    }
}