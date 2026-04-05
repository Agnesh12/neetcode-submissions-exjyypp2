class Solution {
    public void Parenthesis(List<String> result, int num, int open, int close, String tempStr) {
        if((num * 2) == tempStr.length()) {
            result.add(tempStr);
            return;
        }
        if(open < num) {
            Parenthesis(result, num, open + 1, close, tempStr + "(");
        }
       if(open > close) {
            Parenthesis(result, num , open, close + 1, tempStr + ")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> check = new ArrayList<>();
        Parenthesis(check, n, 0, 0, "");
        return check;
    }
}
