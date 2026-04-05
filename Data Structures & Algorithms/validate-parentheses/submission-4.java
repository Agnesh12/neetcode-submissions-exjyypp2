class Solution {
    static boolean Valid(String Str) {
     Stack<Character> Check = new Stack();
     for(char Ch : Str.toCharArray()) {
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
    public boolean isValid(String s) {
        return Valid(s);
    }
}
