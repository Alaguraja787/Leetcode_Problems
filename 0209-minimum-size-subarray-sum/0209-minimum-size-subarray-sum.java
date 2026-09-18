class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length==1){
            if(nums[0]>target){
                return 1;
            }
        }
        int left = 0;
        int right =1;
        int sum =nums[left];
        int min_count = Integer.MAX_VALUE;
        while(left<nums.length && right<nums.length){
            if (sum<target){
                sum += nums[right]; 
                right++;
            }
            while (sum>=target){
                min_count = Math.min(min_count,right-left);  
                sum -= nums[left];
                left++;
            }

            
        }
        return min_count==Integer.MAX_VALUE ? 0:min_count;
    }
}