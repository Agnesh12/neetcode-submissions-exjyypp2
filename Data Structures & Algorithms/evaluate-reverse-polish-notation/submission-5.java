class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> check = new Stack<Integer>();
        int first = 0;
        int second = 0;
        for(String str : tokens) {
            if(str.equals("+")) {
                int Add = check.pop() + check.pop();
                check.push(Add);
            }
            else if(str.equals("-")) {
                first = check.pop();
                second = check.pop();
                check.push(second - first);
            }
            else if(str.equals("*")) {
                check.push(check.pop() * check.pop());
            }
            else if(str.equals("/")){
                first = check.pop();
                second = check.pop();
                check.push(second / first);
            }
            else {
              check.push(Integer.parseInt(str));  
            }
        }
        return check.pop();
    }
}
