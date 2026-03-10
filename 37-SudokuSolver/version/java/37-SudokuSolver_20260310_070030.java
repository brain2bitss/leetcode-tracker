// Last updated: 3/10/2026, 7:00:30 AM
1class Solution {
2    public void solveSudoku(char[][] board) {
3        solve(board);
4    }
5    
6    private boolean solve(char[][] board) {
7        // Traverse through each cell in the board
8        for (int row = 0; row < 9; row++) {
9            for (int col = 0; col < 9; col++) {
10                // If we find an empty cell (represented by '.')
11                if (board[row][col] == '.') {
12                    // Try placing digits 1-9 in this cell
13                    for (char num = '1'; num <= '9'; num++) {
14                        // Check if placing num is valid
15                        if (isValid(board, row, col, num)) {
16                            // Place the number
17                            board[row][col] = num;
18                            
19                            // Recursively try to solve the rest of the board
20                            if (solve(board)) {
21                                return true;
22                            }
23                            
24                            // If placing num leads to no solution, backtrack
25                            board[row][col] = '.';
26                        }
27                    }
28                    // If no digit works, backtrack to previous cell
29                    return false;
30                }
31            }
32        }
33        // If we've filled all cells, the board is solved
34        return true;
35    }
36    
37    private boolean isValid(char[][] board, int row, int col, char num) {
38        // Check the row
39        for (int j = 0; j < 9; j++) {
40            if (board[row][j] == num) {
41                return false;
42            }
43        }
44        
45        // Check the column
46        for (int i = 0; i < 9; i++) {
47            if (board[i][col] == num) {
48                return false;
49            }
50        }
51        
52        // Check the 3x3 sub-box
53        int boxRow = 3 * (row / 3);
54        int boxCol = 3 * (col / 3);
55        for (int i = 0; i < 3; i++) {
56            for (int j = 0; j < 3; j++) {
57                if (board[boxRow + i][boxCol + j] == num) {
58                    return false;
59                }
60            }
61        }
62        
63        return true;
64    }
65}