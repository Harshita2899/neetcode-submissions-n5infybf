class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        #swaping among the rows the do traspose

        top =0
        bottom = len(matrix)-1

        while top<bottom:
            for i in range(len(matrix[0])):
                matrix[top][i],matrix[bottom][i]= matrix[bottom][i],matrix[top][i]
            top=top+1
            bottom= bottom-1
        
        ans = [[0] * len(matrix) for j in range(len(matrix[0]))]

        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                ans[j][i]=matrix[i][j]
        
        matrix[:] = ans[:]
        
