class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums2.length; i++){
            int current = nums2[i];
            while(!st.isEmpty() && st.peek()<current){
                int popped = st.pop();
                map.put(popped,current);
            }
            st.push(current);
        }
        for (int j=0; j<nums1.length; j++){
            int curr = nums1[j];
            if (!map.containsKey(curr)){
                nums1[j] = -1;
            }
            else{
                nums1[j] = map.get(nums1[j]);
            }
        }
        return nums1;
    }
}