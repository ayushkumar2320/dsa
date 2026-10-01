class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        if(y<0){
            return false;
        }
        int revno=0;
        while (y!=0){
            int digit=y%10;
            y/=10;
            revno=revno*10+digit;
        }
        return revno==x;
    }
}