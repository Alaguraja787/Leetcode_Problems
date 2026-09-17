class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        int right =0;
        int sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        
        while (right<k){
            sum +=nums[right];
            right++;
        }

        max = (double)sum/k;

        while (right<nums.length){
            sum -= nums[left];
            sum += nums[right];

            left++;
            right++;
            max = Math.max(max, (double)sum/k);
        }
        return max;
    }
}