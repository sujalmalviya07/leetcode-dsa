
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int j = 1; j <= nums.length; j++) {
            count += j;
        }

        return count - sum;
    }
}
