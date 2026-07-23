class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> res = new ArrayList<>();
        for(String s: words){
            if (ismatch(s,pattern)){
                res.add(s);
            }
        }
        return res;
    }

    private boolean ismatch(String s, String pattern){
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            char pat = pattern.charAt(i);
            char ss = s.charAt(i);

            if (!map1.containsKey(pat) && !map2.containsKey(ss)){
                map1.put(pat,ss);
                map2.put(ss,pat);
            }
            else{
                if(map1.getOrDefault(pat,'#') !=ss || (map2.getOrDefault(ss,'#') != pat)){
                    return false;
                }
            }
        }
        return true;
    }
}