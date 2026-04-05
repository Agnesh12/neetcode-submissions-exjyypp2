class Solution {
    static boolean Valid(String Str) {
    Stack<Character> check = new Stack();
    for(char str : Str.toCharArray()) {
        if(str == '[') {
            check.push(']');
        }

        else if(str == '(') {
            check.push(')');
        }
        else if(str == '{') {
            check.push('}');
        }
        else if(check.isEmpty() || check.pop() != str) {
            return false;
        }
    }
    return check.isEmpty();
    }
    public boolean isValid(String s) {
        return Valid(s);
    }
}
