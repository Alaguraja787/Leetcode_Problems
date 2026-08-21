import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solution(0,0,res,curr, n, nums);
        res.sort((a,b)->{
            int n1 = Math.min(a.size(), b.size());
            for(int i=0; i<n1; i++){
                if (!a.get(i).equals(b.get(i))){
                    return a.get(i)-b.get(i);
                }
            }
            return a.size()-b.size();
        });
        return res;
    }

    public static void solution(int i, int sum, List<List<Integer>> res, List<Integer> curr, int n, int[] nums){
        if (i==n){
            if (!res.contains(curr)){
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        curr.add(nums[i]);
        solution(i+1, sum+nums[i], res, curr, n, nums);
        curr.remove(curr.size()-1);
        solution(i+1, sum, res, curr, n, nums);
    }
}