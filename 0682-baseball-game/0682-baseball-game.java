class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < operations.length; i++){
            char ch = operations[i].charAt(0);
            if(ch != 'D' && ch!='C' && ch!='+') {
                int n  = Integer.parseInt(operations[i]);
                stack.push(n);
                }
            if(ch=='C'){
                stack.pop();
            }
            else if(ch=='D'){
                int n = stack.peek();
                stack.push(n*2);
            }
            else if(ch=='+'){
                int last = stack.pop();
                int secondLast = stack.peek();
                stack.push(last);
                stack.push(last+secondLast);
            }
        }
        int sum = 0; 
        if(stack.isEmpty()) return 0; 
        for(int x: stack){
            sum += x; 
        }
        return sum; 
    }
}