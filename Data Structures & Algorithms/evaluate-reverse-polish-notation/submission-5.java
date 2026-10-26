
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operations = new Stack<>();

        for (String token : tokens) {
            int secondOperand = 0;
            int firstOperand = 0;
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                secondOperand = operations.pop();
                firstOperand = operations.pop();

                switch (token) {
                    case "+":
                        operations.push(firstOperand + secondOperand);
                        break;
                    case "-":
                        operations.push(firstOperand - secondOperand);
                        break;
                    case "*":
                        operations.push(firstOperand * secondOperand);
                        break;
                    case "/":
                        operations.push(firstOperand / secondOperand);
                        break;
                }
            } else {
                operations.push(Integer.parseInt(token));
            }
        }
        return operations.pop();
    }
}
