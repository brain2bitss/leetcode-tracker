// Last updated: 2/2/2026, 2:34:15 PM
class Solution {
    public int arrangeCoins(int n) {
        int ans = 0;int temp = n;int count = 1;
        if(n == 1){
            return 1;
        }
        for(int i = 0; i < temp; i++){
            ans = ans + 1;
            count++;
            temp = temp - ans;
        }
        if(ans == n){
            return count;
        }else{
            return count - 1;
        }
    }
}