class Solution {
    public String convertToTitle(int columnNumber) {
        
        String res = "";
        while (columnNumber != 0){
            columnNumber--;
            int digit = columnNumber%26;
            res = (char)(digit+65) + res;
            columnNumber /= 26;
        }
        return res;
    }
}