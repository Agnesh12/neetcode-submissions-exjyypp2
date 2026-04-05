class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<Character>();
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                check.push(')');
            }
            else if(ch == '{') {
                check.push('}');
            }
            else if(ch == '[') {
                check.push(']');
            }
            else if(check.isEmpty() || ch != check.pop()) {
                return false;
            }
        }
        return check.isEmpty();
    }
}
