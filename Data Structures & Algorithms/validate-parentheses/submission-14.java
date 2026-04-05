class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack();
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                check.push(')');
            }
            else if(ch == '[') {
                check.push(']');
            }
            else if(ch == '{') {
                check.push('}');
            }
            else if(check.isEmpty() || check.pop() != ch) {
                return false;
            }
        }
        return check.isEmpty();
    }
}
