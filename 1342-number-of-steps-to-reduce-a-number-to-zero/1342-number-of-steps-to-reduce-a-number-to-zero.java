class Solution {
    public int numberOfSteps(int num) {
        int step=0;
        int temp=num;
        while(temp>0){
        if(temp%2==0){
            temp/=2;
            step++;
        }else{
            temp-=1;
            step++;
        }


        }
        return step;
    }
}