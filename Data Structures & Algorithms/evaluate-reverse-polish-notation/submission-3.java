class Solution {
    public int evalRPN(String[] arr) {
        Stack<Integer> ans = new Stack();
        int First = 0;
        int Second = 0;
        for(String ch : arr) {
            if(ch.equals("+")) {
            ans.push(ans.pop() + ans.pop());

            }
            else if(ch.equals("-")) {
                First = ans.pop();
                Second = ans.pop();
                ans.push(Second - First);
            }
            else if(ch.equals("*")) {
                ans.push(ans.pop() * ans.pop());
            }
             else if(ch.equals("/")) {
                First = ans.pop();
                Second = ans.pop();
                ans.push(Second / First);
            }
            else {
                ans.push(Integer.parseInt(ch));
            }
        }
        return ans.pop();
    }
}
