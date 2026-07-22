class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum =0;
        int half = num/2;
        for (int i=1; i<half+1; i++){
            if(num%i==0){
                sum += i;
            }
        }
        if (sum==num){
            return true;
        }
        return false;
    }
}