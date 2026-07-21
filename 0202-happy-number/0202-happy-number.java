class Solution {
    public boolean isHappy(int n){
        HashSet<Integer> set  = new HashSet<>();
        while (n != 0){
            int temp = n;
            int sum = 0;
            while (temp != 0){
                int num = temp%10;
                sum += num*num;
                temp /=10;
            }
            if (sum==1){
                return true;
            }
            n = sum;
            if (!set.add(n)){
                return false;
            }
            set.add(n);
        }
        return false;
        
    }
}