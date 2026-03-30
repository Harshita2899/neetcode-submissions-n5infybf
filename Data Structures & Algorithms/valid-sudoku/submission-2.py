class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        row = {}
        col ={}
        grid = {}

        for i in range(0,len(board)):
            for j in range(0,len(board[0])):
                if board[i][j]=='.':
                    continue
                if i in row:
                    if board[i][j] in row[i]:
                        return False
                    else:
                        row[i].append(board[i][j])
                else:
                    row[i] = [board[i][j]]

                if j in col:
                    if board[i][j] in col[j]:
                        return False
                    else:
                        col[j].append(board[i][j])
                else:
                    col[j] = [board[i][j]]

                grid_start = str(i//3) + ' ' + str(j//3)

                if grid_start in grid:
                    if board[i][j] in grid[grid_start]:
                        return False
                    else:
                        grid[grid_start].append(board[i][j])
                else:
                    grid[grid_start] = [board[i][j]]

        return True    
