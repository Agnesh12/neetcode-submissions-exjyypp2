class Solution {
    public int evalRPN(String[] arr) {

        int FinalAns = 0;
        Stack<Integer> Store = new Stack();
        int FirstNo = 0;
        int SecondNo = 0;
        for(String ch : arr) {
            if(ch.equals("+")) {
                FirstNo = Store.pop();
                SecondNo = Store.pop();
                Store.push(FirstNo + SecondNo);
            }
            else if(ch.equals("-")) {
                FirstNo = Store.pop();
                SecondNo = Store.pop();
                Store.push(SecondNo - FirstNo);
            }
             else if(ch.equals("*")) {
                FirstNo = Store.pop();
                SecondNo = Store.pop();
                Store.push(FirstNo * SecondNo);
            }
             else if(ch.equals("/")) {
                FirstNo = Store.pop();
                SecondNo = Store.pop();
                Store.push(SecondNo / FirstNo);
            }
            else {
                Store.push(Integer.parseInt(ch));
            }
        }
        return Store.pop();
    }
}
