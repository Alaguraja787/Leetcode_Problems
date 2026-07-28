class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = nums[0];
        int minsum = nums[0];
        int min_curr =0;
        int max_curr =0;
        int total =0;
        for (int i=0; i<nums.length; i++){
            max_curr = Math.max(nums[i], max_curr+nums[i]);
            maxsum = Math.max(maxsum, max_curr);

            min_curr = Math.min(nums[i], min_curr+nums[i]);
            minsum = Math.min(minsum, min_curr);

            total += nums[i];
        }
        if (maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum, total-minsum);
    }
}