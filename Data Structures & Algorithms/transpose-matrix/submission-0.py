class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        ROWS = len(matrix)
        COLUMN = len(matrix[0])
        res = [[0] * ROWS  for _ in range(COLUMN)]

        for i in range(ROWS):
            for j in range(COLUMN):
                res[j][i] = matrix[i][j]

        return res