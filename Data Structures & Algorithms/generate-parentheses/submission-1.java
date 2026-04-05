class Solution {
    static List<String> Paranthesis(int len, String Store, List<String> Result, int open, int close) {
        if(Store.length() == (len * 2)) {
            Result.add(Store);
        }
        if(open < len) {
            Paranthesis(len, Store + "(", Result, open + 1, close);
        }
         if(close < open) {
            Paranthesis(len, Store + ")", Result, open, close + 1);
        }
        return Result;
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> Result = new ArrayList();
        return Paranthesis(n, "", Result, 0, 0);
    }
}
