class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        for (int i=0; i<n-1;i++){
            prefix[i+1] = prefix[i]*nums[i];
        }

        suffix[n-1] = 1;
        for (int i=n-1; i>0; i--){
            suffix[i-1] = suffix[i]*nums[i];
        }

        for (int i=0; i<n; i++){
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
        
    }
}