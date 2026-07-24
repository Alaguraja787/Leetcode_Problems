class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if (tokens.length==1){
            if (tokens[0]>power){
                return 0;
            }
            else{
                return 1;
            }
        }
        if(tokens.length<1){
            return 0;
        }
        Arrays.sort(tokens);
        int max_score = 0;
        int i=0;
        int j=tokens.length-1;
        int score = 0;
        while(i<=j){
            if (tokens[i] <=power){
                power -= tokens[i];
                score++;
                i++;
            }
            else if (score>0){
                power +=tokens[j];
                score--;
                j--;
            }
            else{
                break;
            }
            max_score = Math.max(max_score, score);

        }
        return max_score;
    }
}


