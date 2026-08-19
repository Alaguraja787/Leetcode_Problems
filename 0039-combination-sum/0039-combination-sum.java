class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solution(0,candidates,target,result, current);
        return result;
    }

    static void solution(int i, int[] candidates, int target, List<List<Integer>> result, List<Integer> current){
        if (target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if (i==candidates.length){
            return;
        }

        if (candidates[i] <=target){
            current.add(candidates[i]);
            solution(i,candidates,target-candidates[i], result, current);
            current.remove(current.size()-1);
        }

        solution(i+1, candidates, target, result, current);
    }
}