class Solution {
    public int addDigits(int num) {
       int sum =0 ;
       int count=0;
       while(num>0){
        int digit=num%10;
        sum+=digit;
        num/=10;

       }

       while(sum>=10){
        count=0;
        while(sum>0){
           int n = sum%10;
            count+=n;
            sum/=10;
        }
        sum=count;

       }
        
      return sum;
} }