class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operations = new Stack<>();

        for (String token : tokens) {
            int secondOperand;
            int firstOperand;
            switch (token) {
                case "+":
                    secondOperand = operations.pop();
                    firstOperand = operations.pop();
                    operations.push(firstOperand+secondOperand);    
                    break;
                case "-":
                    secondOperand = operations.pop();
                    firstOperand = operations.pop();
                    operations.push(firstOperand-secondOperand); 
                    break;
                case "*":
                    secondOperand = operations.pop();
                    firstOperand = operations.pop();
                    operations.push(firstOperand*secondOperand); 
                    break;
                case "/":
                    secondOperand = operations.pop();
                    firstOperand = operations.pop();
                    operations.push(firstOperand/secondOperand); 
                    break;
                default:
                    operations.push(Integer.parseInt(token));
            }
        }
        return operations.pop();
    }
}
