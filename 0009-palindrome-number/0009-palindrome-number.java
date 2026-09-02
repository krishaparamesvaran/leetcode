class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int palindrome=0;
        while(x>0){
            int rem =x%10;
            palindrome=palindrome*10+rem;
            x=x/10;
        }
        if(palindrome==temp){
                return true;
        }
        else{
            return false;
        }
    }
}