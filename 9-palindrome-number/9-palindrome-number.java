class Solution {
    public boolean isPalindrome(int x) {
        if(x<10 && x>0)
            return true;
        if(x<0)
            return false;
        // StringBuilder s1= new StringBuilder(String.valueOf(x));
        // return s1.reverse().equals(s1);
        int reversNumber=0;
        int temp =x;
        while(temp>0){
            reversNumber=reversNumber*10 + temp%10;
            temp/=10;
        }
        return x == reversNumber;
    }
}