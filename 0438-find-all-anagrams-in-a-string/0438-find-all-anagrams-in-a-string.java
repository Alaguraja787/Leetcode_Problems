class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if (p.length() > s.length()) {
            return res;
        }
        for (char i: p.toCharArray()){
            map1.put(i, map1.getOrDefault(i,0)+1);
        }

        for (int j=0; j<p.length(); j++){
            map2.put(s.charAt(j),map2.getOrDefault(s.charAt(j),0)+1);
        }
        int left =0;
        if (map1.equals(map2)){
            res.add(left);
        }
        for (int right=p.length();right<s.length();right++){
            map2.put(s.charAt(left),map2.getOrDefault(s.charAt(left),0)-1);
            if (map2.get(s.charAt(left))==0){
                map2.remove(s.charAt(left));
            }
            map2.put(s.charAt(right),map2.getOrDefault(s.charAt(right),0)+1);
            left++;

            if (map1.equals(map2)){
                res.add(left);
            }
            
        }
        return res;
    }
}