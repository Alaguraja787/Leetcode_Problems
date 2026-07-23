class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        HashSet<String> set = new HashSet<>();
        for (String i: words){
            int j=0;
            String temp = "";
            while (j<i.length()){
                int num = i.charAt(j)-'a';
                temp += morse[num];
                j++;
            }
            set.add(temp);
        }
        return set.size();
    }
}