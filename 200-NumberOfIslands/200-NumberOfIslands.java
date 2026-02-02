// Last updated: 2/2/2026, 2:34:32 PM
class Solution {
    public void dfsTraversal(char[][] grid, int[] start, boolean[][] visited){
        int i = start[0];
        int j = start[1];
        visited[i][j] = true;
        int[][] child = {{i+1,j},{i-1,j},{i,j+1},{i,j-1}};
        for(int k = 0; k < child.length; k++){
            i = child[k][0];
            j = child[k][1];
            if(i < grid.length && j < grid[0].length && i >= 0 && j >= 0 && !visited[i][j] && grid[i][j] == '1'){
                dfsTraversal(grid, new int[]{i, j}, visited);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j] && grid[i][j] == '1')
                {
                    dfsTraversal(grid, new int[]{i, j}, visited);
                    answer++;
                }
            }
        }
        return answer;
    }
}

