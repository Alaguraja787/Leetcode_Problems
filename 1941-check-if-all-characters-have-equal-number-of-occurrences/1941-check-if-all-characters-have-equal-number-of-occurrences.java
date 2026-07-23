class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i :s.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
            
        }
        
        char ch = s.charAt(0);
        int freq = map.get(ch);
        for (char j:s.toCharArray()){
            if(map.get(j) != freq){
                return false;

            }
        }
        return true;
    }
}