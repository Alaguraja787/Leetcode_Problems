class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String str: operations){
            if (str.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else if (str.equals("C")){
                st.pop();
            }
            else{
                if (str.equals("D")){
                    int c = st.peek();
                    st.push(c*2);
                }
                else{
                    st.push(Integer.parseInt(str));
                }
            }
        }
        int res =0;
        while(!st.isEmpty()){
            res += st.pop();
        }
        return res;
        
    }
}