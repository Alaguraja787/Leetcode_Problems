class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> result = new ArrayList<>();
     List<Integer> current  = new ArrayList<>();

     solution(0,nums,result,current); 
     return result;
    }

    public static void solution(int i, int[] nums, List<List<Integer>> result, List<Integer> current){
        if (i==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[i]);
        solution(i+1, nums, result, current);

        current.remove(current.size()-1);
        solution(i+1, nums, result, current);
    }
}