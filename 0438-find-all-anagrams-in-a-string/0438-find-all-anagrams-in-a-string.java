class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        if (p.length()>s.length()){
            return res;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x:p.toCharArray()){
            map1.put(x, map1.getOrDefault(x,0)+1);
        }

        for (int i=0;i<p.length(); i++){
            char ch=s.charAt(i);
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }

        int left =0;
        if (map1.equals(map2)){
            res.add(left);
        }

        for (int right=p.length();right<s.length();right++){
            map2.put(s.charAt(left), map2.getOrDefault(s.charAt(left),0)-1);
            if (map2.get(s.charAt(left))==0){
                map2.remove(s.charAt(left));
            }
            left++;
            map2.put(s.charAt(right), map2.getOrDefault(s.charAt(right),0)+1);

            if (map1.equals(map2)){
                res.add(left);
            }
        }
        return res;
    }
}