class Solution {
    public char findTheDifference(String s, String t) {
        // if (s.length()==1 && t.length()==2){
        //     return t.charAt(1);
        // }
        // ArrayList<Character> set = new ArrayList<>();
        // char res ='#';
        // for (int i=0; i<s.length(); i++){
        //     set.add(s.charAt(i));
        // }
        // for (int j=0; j<t.length();j++){
        //     char ch = t.charAt(j);
        //     if (!set.contains(ch)){
        //         res = ch;
        //     }
        // }
        // return res;
        char[] chars = s.toCharArray();
        char[] charss = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(charss);
        String ss = new String(chars);
        String tt = new String(charss);
        int i=0;
        int j=0;
        int m=ss.length();
        int n=tt.length();
        char res = '#';
        while (i<m && j<n){
            if (ss.charAt(i) == tt.charAt(j)){
                i++;
                j++;
            }
            else{
                return tt.charAt(j);
            }
        }
        return tt.charAt(j);
    }
}