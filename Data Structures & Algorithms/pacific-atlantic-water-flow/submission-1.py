class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:

        rows = len(heights)
        cols = len(heights[0])

        pacific = [[False] * cols for _ in range(rows)]
        atlantic = [[False] * cols for _ in range(rows)]

        direc = [[-1,0],[0,-1],[1,0],[0,1]]

        def dfs(i, j, visited):

            visited[i][j] = True

            for dr, dc in direc:

                newi = i + dr
                newj = j + dc

                if (0 <= newi < rows and
                    0 <= newj < cols and
                    not visited[newi][newj] and
                    heights[newi][newj] >= heights[i][j]):

                    dfs(newi, newj, visited)

        # Pacific borders
        for i in range(rows):
            dfs(i, 0, pacific)

        for j in range(cols):
            dfs(0, j, pacific)

        # Atlantic borders
        for i in range(rows):
            dfs(i, cols - 1, atlantic)

        for j in range(cols):
            dfs(rows - 1, j, atlantic)

        ans = []

        for i in range(rows):
            for j in range(cols):

                if pacific[i][j] and atlantic[i][j]:
                    ans.append([i, j])

        return ans