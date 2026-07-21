class Solution {
    public boolean isHappy(int n){
        while (n != 0){
            int temp = n;
            int sum = 0;
            while (temp != 0){
                int num = temp%10;
                sum += num*num;
                temp /=10;
            }
            n = sum;

            if (n != 1 && n<10 && n !=7){
                return false;
            }
            if (n==1){
                return true;
            }
        }
        return false;
        
    }
}