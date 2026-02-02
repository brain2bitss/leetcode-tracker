// Last updated: 2/2/2026, 2:34:37 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int front = 1; int end = numbers.length;
        int first = 0; int second = numbers.length - 1;int sum = 0;
        int[] result = new int[2];
        while(first < second){
            sum = numbers[first] + numbers[second];
            if(sum == target){
                result[0] = first + 1;
                result[1] = second + 1;
                break;
            }else if(sum < target){
                first++;
            }else{
                second--;
            }
        }
        return result;
    }
}