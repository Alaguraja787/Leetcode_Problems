class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while (j<k){
                List<Integer> current = new ArrayList<>();
                int total = nums[i]+nums[j]+nums[k];
                if (total==0){
                    current.add(nums[i]);
                    current.add(nums[j]);
                    current.add(nums[k]);
                    result.add(new ArrayList<>(current));
                    j++;
                    k--;
                    while (j<=k && nums[k]==nums[k+1]){
                        k--;
                    }
                    while (j<=k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
                else if(total>0){
                    k--;
                }
                else{
                    j++;
                }
                
            }
        }
        return result;
        
    }
}