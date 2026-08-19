class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solution(0,target, candidates, result, current);
        return result;
    }

    public static void solution(int i, int target, int[] candidates, List<List<Integer>> result, List<Integer> current){
        if (target==0){
            result.add(new ArrayList<>(current));
            return;
        }

        for (int j=i; j<candidates.length; j++){
            if (j>i && candidates[j]==candidates[j-1]){
                continue;
            }
            if (target<candidates[j]){
                break;
            }
            current.add(candidates[j]);
            solution(j+1,target-candidates[j], candidates, result, current);
            current.remove(current.size()-1);
        }

    }
}