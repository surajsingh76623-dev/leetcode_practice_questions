class Solution {
    public int findNumbers(int[] nums) {
        int n;
        int count=0;
        for(int i=0;i<nums.length;i++){
            n=(int)(Math.log10(nums[i]))+1;
            if(n%2==0){
                count++;
            }
        }
        return count;
    }
}