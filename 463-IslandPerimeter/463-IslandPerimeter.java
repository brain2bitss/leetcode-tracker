// Last updated: 2/2/2026, 2:34:14 PM
class Solution {
    public int dfs(int[][] grid, int[] start, boolean[][] visit){
        int i = start[0];
        int j = start[1];
        visit[i][j] = true;

        int perimeter = 0;
        int[][] child = {{i + 1, j}, {i - 1, j}, {i, j+1}, {i, j - 1}};

        for(int k = 0; k < 4; k++){
            int ni = child[k][0];
            int nj = child[k][1];

            // If neighbor is out of bounds OR water → contributes to perimeter
            if(ni < 0 || nj < 0 || ni >= grid.length || nj >= grid[0].length || grid[ni][nj] == 0){
                perimeter++;
            } 
            // If neighbor is land and not visited → DFS
            else if(!visit[ni][nj] && grid[ni][nj] == 1){
                perimeter += dfs(grid, new int[]{ni,nj}, visit);
            }
        }
        return perimeter;
    }

    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visit = new boolean[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){ 
                    // Start DFS from the first land cell
                    return dfs(grid, new int[]{i,j}, visit);
                }
            }
        }
        return 0;
    }
}