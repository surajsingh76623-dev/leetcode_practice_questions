class Solution {
    public void reverseString(char[] s) {
      rev(s,0,s.length-1);



    }
    static void rev(char[] s,int l,int r){
        if(l>=r){
            return;
        }
        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;

        rev(s,l+1,r-1);
    }
}