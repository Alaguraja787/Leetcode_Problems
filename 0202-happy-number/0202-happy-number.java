class Solution {
    public boolean isHappy(int n){
        HashSet<Integer> set  = new HashSet<>();
        while (n != 0){
            set.add(n);
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
            if (set.contains(n)){
                return false;
            }
        }
        return false;
        
    }
}