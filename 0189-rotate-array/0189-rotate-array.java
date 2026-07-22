class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        k %= n;
        for (int i=0; i<n; i++){
            res[(i+k)%n] = nums[i];
        }
        for (int j =0; j<n; j++){
            nums[j] = res[j];
        }

        
    }
}