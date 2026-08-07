class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int i=0; i<nums.length;i++){
            int diff = target - nums[i];
            if (!map.containsKey(diff)){
                map.put(nums[i], map.getOrDefault(nums[i],i));

            }
            else{
                arr[0] = map.get(diff);
                arr[1] = i;
            }
        }
        return arr;
        
    }
}