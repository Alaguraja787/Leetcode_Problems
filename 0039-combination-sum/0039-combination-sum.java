class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solution(0,target,candidates,result,current);
        return result;
    }

    public static void solution(int i, int target, int[] candidates, List<List<Integer>> result, List<Integer> current){
        if (i==candidates.length){
            return;
        }
        if (target==0){
            result.add(new ArrayList<>(current));
            return;
        }

        if (target>=candidates[i]){
            current.add(candidates[i]);
            solution(i,target-candidates[i], candidates, result, current);
            current.remove(current.size()-1);
        }
        solution(i+1, target, candidates,result,current);
    }
}