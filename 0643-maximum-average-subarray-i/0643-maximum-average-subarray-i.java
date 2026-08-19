class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int sum =0;
        double max =Double.NEGATIVE_INFINITY;
        for (int j=0; j<nums.length; j++){
            sum += nums[j];
            if (j-i+1 == k){
                max = Math.max(max, (double)sum/k);
                sum -= nums[i];
                i++;
            }
        }
        return max;
    }
}