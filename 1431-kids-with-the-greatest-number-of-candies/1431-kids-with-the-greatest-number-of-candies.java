class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int large = Integer.MIN_VALUE;
        int i =0;
        while(i<candies.length){
            if (candies[i] >large){
                large = candies[i];
            }
            i++;
        }
        int j=0;
        while (j<candies.length){
            int temp =candies[j] + extraCandies;
            if (temp>=large){
                result.add(true);
            }
            else{
                result.add(false);
            }
            j++;
        }
        return result;
        
    }
}