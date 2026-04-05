class Solution {
    public boolean isValid(String s) {
        Stack<Character> Ans = new Stack();
        for(char Ch : s.toCharArray()) {
            if(Ch == '[') {
                Ans.push(']');
            }
            else if(Ch == '{') {
                Ans.push('}');
            }
            else if(Ch == '(') {
                Ans.push(')');
            }
            else if(Ans.isEmpty() || Ans.pop() != Ch) {
                return false;
            }
        }
        return Ans.isEmpty();
    }
}
