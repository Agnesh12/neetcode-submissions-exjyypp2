class Solution {
    public boolean isPalindrome(String s) {
        int Start = 0;
        int End = s.length() - 1;
        while(Start <= End) {
         char FirstChar = s.charAt(Start);
         char LastChar = s.charAt(End);
         if(!Character.isLetterOrDigit(FirstChar)) {
            Start++;
         }
         else if(!Character.isLetterOrDigit(LastChar)) {
            End--;
         }
         else {
            if(Character.toLowerCase(FirstChar) != Character.toLowerCase(LastChar)) {
                return false;
            }
            Start++;
            End--;
         }

        }
        return true;
    }
}
