class Solution {
    public int compress(char[] chars) {
        String res = "";
        for (int i=0; i<chars.length;i++){
            int count=1;
            char ch = chars[i];
            int j =i+1;
            while (j<chars.length){
                if (chars[j] != ch){
                    break;
                }
                else{
                    count++;
                    j++;
                }
            }
            i =j-1;
            res += ch;
            if (count>1){
                res += String.valueOf(count);
            } 
            for (int k=0;k<res.length(); k++){
                chars[k]= res.charAt(k);
            }
        }
        return res.length();

    }
}