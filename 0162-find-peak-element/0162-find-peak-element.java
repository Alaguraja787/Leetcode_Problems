class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length==1){
            return 0;
        }
        int ans = Integer.MIN_VALUE;
        for (int i=0; i<nums.length;i++){
            if (i==0){
                if(ans<nums[i] && nums[i]>nums[i+1]){
                    return i;
                }
            }
            else if(i==nums.length-1){
                if(ans<nums[i] && nums[i]>nums[i-1]){
                    return i;
                }
            }
            else{
                if (nums[i]>nums[i+1] && nums[i]>nums[i-1]){
                    return i;
                }
            }

        }
        return -1;
    }
}