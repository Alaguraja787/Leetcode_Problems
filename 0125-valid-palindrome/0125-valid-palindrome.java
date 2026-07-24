class Solution {
    public boolean isPalindrome(String s) {
        String org = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int j=org.length()-1;
        while (i<j){
            if (org.charAt(i) != org.charAt(j)){
                return false;
            }
            j--;
            i++;
        }
        return true;

    }
}