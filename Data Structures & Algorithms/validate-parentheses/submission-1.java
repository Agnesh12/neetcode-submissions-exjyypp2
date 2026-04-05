class Solution {
    static boolean Valid(String Str) {
        Stack<Character> Ans = new Stack();
        for(char ch : Str.toCharArray()) {
            if(ch == '(') {
                Ans.push(')');
            }
            else if(ch == '[') {
                Ans.push(']');
            }
            else if(ch == '{') {
                Ans.push('}');
            }
            else if(Ans.isEmpty() || Ans.pop() != ch) {
                return false;
            }
        }
        return Ans.isEmpty();
    }
    public boolean isValid(String s) {
        return Valid(s);
    }
}
