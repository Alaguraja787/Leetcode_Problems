class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> res = new ArrayList<>();
        for (String s: words){
            if(ismatch(s,pattern)){
                res.add(s);
            }
        }


    
        return res;
    }
    private boolean ismatch(String word,String pat){
            HashMap<Character, Character> map1 = new HashMap<>();
            HashMap<Character, Character> map2 = new HashMap<>();
            for (int i=0; i<word.length(); i++){
                char p = pat.charAt(i);
                char w = word.charAt(i);
                if (!map1.containsKey(p) && !map2.containsKey(w)){
                    map1.put(p, w);
                    map2.put(w,p);
                }
                else{
                    if (map1.getOrDefault(p, '#') != w || (map2.getOrDefault(w,'#') != p)){
                        return false;
                    }
                }
            }
            return true;
        }
}