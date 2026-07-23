class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0; i<s.length();i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if(!map1.containsKey(ss) && !map2.containsKey(tt)){
                map1.put(ss,tt);
                map2.put(tt,ss);
            }
            else{
                if (map1.getOrDefault(ss,'#') != tt){
                    return false;
                }
            }
        }
        return true;
        
    }
}