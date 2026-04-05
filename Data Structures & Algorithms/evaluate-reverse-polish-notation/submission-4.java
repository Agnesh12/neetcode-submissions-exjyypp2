class Solution {
    public int evalRPN(String[] arr) {
        Stack<Integer> Ans = new Stack();
        int First = 0;
        int Second = 0;
        for(String num : arr) {
            if(num.equals("+")) {
                Ans.push(Ans.pop() + Ans.pop());
            }
            else if(num.equals("-")) {
                First = Ans.pop();
                Second = Ans.pop();
                Ans.push(Second - First);
            }
            else if(num.equals("*")) {
                Ans.push(Ans.pop() * Ans.pop());
            }
            else if(num.equals("/")) {
                First = Ans.pop();
                Second = Ans.pop();
                Ans.push(Second / First);
            }
            else {
                Ans.push(Integer.parseInt(num));
            }
        }
        return Ans.pop();
    }
}
