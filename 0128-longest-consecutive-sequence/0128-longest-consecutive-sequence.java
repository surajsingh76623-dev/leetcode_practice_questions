class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        HashSet<Integer> set=new HashSet<>();

        for(int x:nums){
            set.add(x);
        }
        int maxlength=1;
        for(int x:set){
            if(!set.contains(x-1)){
                int count=1;
                
                while(set.contains(x+1)){
                    count++;
                    x=x+1;
                }
                maxlength=Math.max(maxlength,count);
            }
        }
        return maxlength;
    }
}