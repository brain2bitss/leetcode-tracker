// Last updated: 2/20/2026, 11:46:32 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> getRow(int rowIndex) {
5        List<Integer> row = new ArrayList<>();
6        row.add(1); // First element is always 1
7        
8        for (int i = 1; i <= rowIndex; i++) {
9            // Traverse backwards to avoid overwriting values we still need
10            for (int j = row.size() - 1; j > 0; j--) {
11                row.set(j, row.get(j) + row.get(j - 1));
12            }
13            row.add(1); // Last element is always 1
14        }
15        
16        return row;
17    }
18}