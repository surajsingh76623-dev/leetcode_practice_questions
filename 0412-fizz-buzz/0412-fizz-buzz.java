class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> name=new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                name.add("FizzBuzz");
            }else if(i%3==0){
                name.add("Fizz");
            }else if(i%5==0){
                name.add("Buzz");
            }else {
                name.add(String.valueOf(i));
            }
        }
        return name;
    }
}