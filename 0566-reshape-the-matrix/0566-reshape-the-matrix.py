class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        matrix = [[0 for col in range(c)] for row in range(r)]
        arr = []
        m = len(mat)
        n = len(mat[0])
        if m*n == r*c:
            for row in range(m):
                for col in range(n):
                    arr.append(mat[row][col])

            index = 0
            for i in range(r):
                for j in range(c):
                    matrix[i][j] = arr[index]
                    index+=1

                    
        else:
            return mat
        
        return matrix

       
        