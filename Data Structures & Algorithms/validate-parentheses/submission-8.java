class Solution {
    public boolean isValid(String s) {
       Stack<Character> Check = new Stack();
       for(char Ch : s.toCharArray()) {
        if(Ch == '[') {
            Check.push(']');
        }
        else if(Ch == '(') {
            Check.push(')');
        }
        else if(Ch == '{') {
            Check.push('}');
        }
        else if(Check.isEmpty() || Check.pop() != Ch) {
            return false;
        }
       }
       return Check.isEmpty();
    }
}
