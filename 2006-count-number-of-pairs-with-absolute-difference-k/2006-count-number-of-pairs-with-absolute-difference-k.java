class Solution {
    public int countKDifference(int[] nums, int k) {
         int count=0;
        
        for(int i=0 ; i<nums.length-1;i++){
            for(int j =i+1; j<nums.length; j++){
                int value=nums[i]-nums[j];

                if(Math.abs(value)==k){
                    count++;
                }
            }
            
        }
        if(count==0){
                return 0;
            }
        return count;
    }
}