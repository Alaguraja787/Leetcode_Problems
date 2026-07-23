class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i :s.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int freq = map.values().iterator().next();
        for (char j:s.toCharArray()){
            if(map.get(j) != freq){
                return false;

            }
        }
        return true;
    }
}