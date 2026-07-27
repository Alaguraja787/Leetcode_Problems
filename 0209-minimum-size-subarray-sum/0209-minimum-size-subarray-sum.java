class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int end = 0;
        int start = 0;
        int windows = nums[0];
        int min_len = Integer.MAX_VALUE;
        if (windows>=target){
            return 1;
        }
        while(end<nums.length-1){
            end++;
            windows+=nums[end];
            while (windows>=target){
                min_len = Math.min(min_len, end-start+1);
                windows -= nums[start];
                start++;
            }
        }
        return min_len == Integer.MAX_VALUE ? 0:min_len;
        
    }
}