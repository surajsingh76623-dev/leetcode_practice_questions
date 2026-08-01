class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev=0;
        for(int i=0;i<2;i++){
            
            while(temp>0){
                int digit=temp%10;
                rev=rev*10+digit;
                temp/=10;
            }
            if(i==0){
                temp=rev;
                rev=0;
            }
        }
        return rev==num;
    }
}