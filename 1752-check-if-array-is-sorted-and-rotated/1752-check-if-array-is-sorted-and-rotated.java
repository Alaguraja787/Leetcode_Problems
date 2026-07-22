class Solution {
    public boolean check(int[] nums) {
        int excuse =0;
        for (int i=0; i<nums.length; i++){
            if ((nums[(i+1)%nums.length]) < nums[i]){
                excuse++;
            }
        }
        return excuse < 2;
    }
}