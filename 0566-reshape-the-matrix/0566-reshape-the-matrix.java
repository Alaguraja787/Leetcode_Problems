class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n =mat[0].length;
        if (m*n != r*c){
            return mat;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                arr.add(mat[row][col]);
            }
        }
        int[][] matrix = new int[r][c];
        int index = 0;
        for (int i =0; i<r;i++){
            for (int j =0;j<c; j++){
                matrix[i][j] = arr.get(index);
                index++;
            }
        }
        return matrix;
        
    }
}