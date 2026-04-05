class Solution {
    public boolean isPalindrome(String s) {
    int Start = 0;
    int End = s.length() - 1;
    while(Start <= End) {
        char LeftChar = s.charAt(Start);
        char RightChar = s.charAt(End);
        if(!Character.isLetterOrDigit(LeftChar)) {
            Start++;
        }
        else if(!Character.isLetterOrDigit(RightChar)) {
            End--;
        }
        else {
            if(Character.toLowerCase(LeftChar) != Character.toLowerCase(RightChar)) {
                return false;
            }
            Start++;
            End--;
        }
    }
    return true;
    }
}
