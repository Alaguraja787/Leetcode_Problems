class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i: magazine.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for (int k=0; k<ransomNote.length(); k++){
            char ch = ransomNote.charAt(k);
            if (map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0)-1);
            }
            else if (!map.containsKey(ch)){
                return false;
            }
        }
        for (char x:map.keySet()){
            if (map.get(x)< 0){
                return false;
            }
        }


        return true;
    }
}