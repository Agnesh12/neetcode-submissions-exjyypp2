class Solution {
    public List<String> Generate(List<String> Ans, int len, int Open, int Close, String Result) {
        if(Result.length() == (len * 2)) {
            Ans.add(Result);
        }
        if(Open < len) {
            Generate(Ans, len, Open + 1, Close, Result + "(");
        }
        if(Open > Close) {
            Generate(Ans, len, Open, Close + 1, Result + ")");
        }
        return Ans;
    }
    public List<String> generateParenthesis(int n) {
        List<String> Ans = new ArrayList();
        int Open = 0;
        int Close = 0;
        return Generate(Ans, n, Open, Close, "");
    }
}
