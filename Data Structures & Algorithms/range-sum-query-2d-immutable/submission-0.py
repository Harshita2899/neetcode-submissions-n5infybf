class NumMatrix:

    def __init__(self, matrix: List[List[int]]):
        ROW = len(matrix)
        COL = len(matrix[0])

        self.mat = [[0]*(COL+1) for i in range(ROW+1)]
        for i in range(ROW+1):
            for j in range(COL+1):
                if i==0 or j==0:
                    self.mat[i][j] =0

        for i in range(1,ROW+1):
            for j in range(1,COL+1):
                diagonal = self.mat[i-1][j-1]
                above = self.mat[i-1][j]
                left = self.mat[i][j-1]
                self.mat[i][j] = matrix[i-1][j-1]+above+left-diagonal

    def sumRegion(self, row1: int, col1: int, row2: int, col2: int) -> int:
        r1,r2,c1,c2 = row1+1,row2+1, col1+1, col2+1
        above = self.mat[r1-1][c2]
        left = self.mat[r2][c1-1]
        common = self.mat[r1-1][c1-1]

        return self.mat[r2][c2] - left- above+common


# Your NumMatrix object will be instantiated and called as such:
# obj = NumMatrix(matrix)
# param_1 = obj.sumRegion(row1,col1,row2,col2)