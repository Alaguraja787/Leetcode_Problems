class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char i: magazine.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for (char j: ransomNote.toCharArray()){
            map1.put(j, map1.getOrDefault(j,0)+1);
        }

        for (int k=0; k<ransomNote.length(); k++){
            char ch = ransomNote.charAt(k);
            if (!map.containsKey(ch)){
                return false;
            }
            else if(map.get(ch) < map1.get(ch)){
                return false;
            }
        }


        return true;
    }
}