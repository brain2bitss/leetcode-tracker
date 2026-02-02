// Last updated: 2/2/2026, 2:34:34 PM
class Solution {
    public int hammingWeight(int n) {
        int a[] = new int[64] ;
        int x = 0, i;
        for (i = 0; n > 0; i++) {
            a[i] = n % 2;
            n /= 2;
        }
        int count = 0;
        for(int f = 0; f < a.length; f++){
            if(a[f] == 1){
                count++;
            }
        }
        return count;
    }
}