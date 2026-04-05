class Solution {
    public boolean isPalindrome(String s) {
        int Start = 0;
        int End = s.length() - 1;
        while(Start < End) {
            char First = s.charAt(Start);
            char Last = s.charAt(End);
            if(!Character.isLetterOrDigit(First)) {
                Start++;
            }
            else if(!Character.isLetterOrDigit(Last)) {
                End--;
            }
            else {
                if(Character.toLowerCase(First) != Character.toLowerCase(Last)) {
                        return false;
                }
                Start++;
                End--;
            }
        }
        return true;
    }
}
