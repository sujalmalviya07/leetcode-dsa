class Solution {
    public int[] runningSum(int[] nums) {
        int digit=0;
        for(int i=0 ; i<nums.length ; i++){
            digit+=nums[i];
            nums[i]=digit;
            
        }
        return nums;
    }
}