class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();

        map.put(')' , '(');
        map.put('}' , '{');
        map.put(']' , '[');

        if (s.length()==1){
            return false;
        }
        Stack<Character> st = new Stack<>();

        for (char ch: s.toCharArray()){
            if (ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }

            else{
                if (st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if (ch==')' && top!='('){
                    return false;
                }

                if (ch=='}' && top!='{'){
                    return false;
                }

                if (ch==']' && top!='['){
                    return false;
                }
            }
        }
        if (!st.isEmpty()){
            return false;
        }
        return true;
    }
}