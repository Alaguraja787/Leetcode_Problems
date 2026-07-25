class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        int average = 0;
        int i=0;
        int j=0;
        int len = nums.length;
        while (j<k){
            sum +=nums[j];
            j++;
        }
        double max_avg = (double)sum/k;
        while(j<nums.length){
            sum -=nums[i];
            sum +=nums[j];
            max_avg = Math.max(max_avg,(double)sum/k);
            i++;
            j++;
        }
        return max_avg;
        
    }
}