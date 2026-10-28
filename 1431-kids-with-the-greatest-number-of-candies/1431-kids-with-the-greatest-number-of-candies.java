class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         ArrayList<Integer> l=new ArrayList<>();
       int max=0;
        for(int i=0;i<candies.length;i++){
            l.add(candies[i]);
            if(candies[i]>max){
                max=candies[i];
            }
        }
        ArrayList<Boolean> result=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(l.get(i)+extraCandies>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }

       

       return result;
    }
}