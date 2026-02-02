// Last updated: 2/2/2026, 2:34:31 PM
class Solution {
    public boolean isHappy(int n) {

        if(n==1 || n == 7) return true;
        else if(n<10) return false;
        else{
            int sum=0;
            while(n>0){
                int temp=n%10;
                sum+= temp*temp;
                n=n/10;
            }
            return isHappy(sum);
        }

    //     Set<Integer> seenNumbers = new HashSet<>();
        
    //     while (n != 1 && !seenNumbers.contains(n)) {
    //         seenNumbers.add(n);
    //         n = getSumOfSquares(n);
    //     }
        
    //     return n == 1;
    // }

    // private int getSumOfSquares(int num) {
    //     int sum = 0;
    //     while (num > 0) {
    //         int digit = num % 10;
    //         sum += digit * digit;
    //         num /= 10;
    //     }
    //     return sum;

    }
}