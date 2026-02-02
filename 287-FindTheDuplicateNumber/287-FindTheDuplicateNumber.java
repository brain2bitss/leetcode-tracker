// Last updated: 2/2/2026, 2:34:20 PM
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(fast != slow);
        fast = nums[0];
        while(fast != slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    //    	int n = nums.length + 1;
    //    for(int i = 0; i < nums.length; i++){
    //        int index = nums[i]%n;
    //        int temp = nums[index];
    //        nums[index]= temp + n;
    //    }
    //    int result = -1;
    //    for(int i = 0; i < nums.length; i++){
    //        if(nums[i]/n >= 2){
    //            result = i;
    //            break;
    //        }
    //    }
    //    return result;
    }
}