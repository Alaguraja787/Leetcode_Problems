class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_num = 0;
        int sum = 0;
        for (int i=0;i<accounts.length;i++){
            for (int j=0; j<accounts[i].length; j++){
                sum +=accounts[i][j];
            }
            max_num = Math.max(sum, max_num);
            sum = 0;
        }
        return max_num;
    }
}