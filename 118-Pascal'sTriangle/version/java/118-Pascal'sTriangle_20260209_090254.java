// Last updated: 2/9/2026, 9:02:54 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> generate(int numRows) {
5        List<List<Integer>> triangle = new ArrayList<>();
6
7        if (numRows == 0) return triangle;
8
9        // First row is always [1]
10        triangle.add(new ArrayList<>());
11        triangle.get(0).add(1);
12
13        // Build each row from the previous one
14        for (int i = 1; i < numRows; i++) {
15            List<Integer> prevRow = triangle.get(i - 1);
16            List<Integer> row = new ArrayList<>();
17
18            row.add(1); // first element
19
20            for (int j = 1; j < i; j++) {
21                row.add(prevRow.get(j - 1) + prevRow.get(j));
22            }
23
24            row.add(1); // last element
25            triangle.add(row);
26        }
27
28        return triangle;
29    }
30}