// Last updated: 2/2/2026, 2:34:10 PM
class Solution {
    public int findCenter(int[][] edges) {
        int common;
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            common = edges[0][0];
        }else{
            common = edges[0][1];
        }
        return common;
    }
}