class Solution {
    public boolean isPalindrome(int x) {
        if(x<10 && x>0)
            return true;
        if(x<0)
            return false;
        StringBuilder s1= new StringBuilder();
        s1.append(x);
        return s1.reverse().toString().equals(String.valueOf(x));
        // int reversNumber=0;
        // int temp =x;
        // while(temp>0){
        //     reversNumber=reversNumber*10 + temp%10;
        //     temp/=10;
        // }
        // return x == reversNumber;
    }
}