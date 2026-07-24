class Solution {
    public void duplicateZeros(int[] arr) {
        int k=0;
        int[] res = new int[arr.length];
        int len = arr.length;
        int i=0;
        while (k<len && i<len){
            if (arr[i] == 0){
                res[k] =arr[i];
                k++;
                if (k<len){
                    res[k] = arr[i];
                    i++;
                    k++;
                }
            } 
            else{
                res[k] = arr[i];
                i++;
                k++;
            }
        }  
        for (int j=0; j<res.length; j++){
            arr[j] = res[j];
        }
    }
}