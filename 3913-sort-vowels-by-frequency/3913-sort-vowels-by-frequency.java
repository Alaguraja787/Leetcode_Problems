import java.util.*;

class Solution {
    public String sortVowels(String s) {

        int[] freq = new int[26];
        int[] first = new int[26];
        Arrays.fill(first, -1);

        Character[] vowels = {'a','e','i','o','u'};

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(isVowel(ch)){
                freq[ch-'a']++;

                if(first[ch-'a']==-1){
                    first[ch-'a']=i;
                }
            }
        }

        Arrays.sort(vowels,(a,b)->{

            if(freq[a-'a']!=freq[b-'a']){
                return freq[b-'a']-freq[a-'a'];
            }

            if(first[a-'a']==-1) return 1;
            if(first[b-'a']==-1) return -1;

            return first[a-'a']-first[b-'a'];
        });

        char[] ans=s.toCharArray();

        int idx=0;
        int remain=freq[vowels[idx]-'a'];

        for(int i=0;i<ans.length;i++){

            if(!isVowel(ans[i])) continue;

            while(remain==0){
                idx++;
                remain=freq[vowels[idx]-'a'];
            }

            ans[i]=vowels[idx];
            remain--;
        }

        return new String(ans);
    }

    private boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}