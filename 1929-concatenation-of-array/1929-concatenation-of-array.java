class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        if(n==0) return nums;
      
        int [] ans = new int[2*nums.length];
        for(int i=0; i<nums.length;i++){
            ans[i]=nums[i];
        }
        for(int j=nums.length; j<ans.length ; j++){
           ans[j]=nums[j-nums.length];
        }
        return ans;
    }
}