// Last updated: 2/20/2026, 1:54:45 PM
1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> row = new ArrayList<>();
4        row.add(1); // FIRST ELEMENT IS ALWAYS ZERO
5
6        for(int i = 1; i <= rowIndex; i++){
7            for(int j = row.size() - 1; j > 0; j--){
8                row.set(j, row.get(j) + row.get(j - 1));
9            }
10            row.add(1); //LAST ELEMENT IS 1;
11        }
12
13        return row;
14    }
15}