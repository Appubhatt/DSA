package DLP;

import java.util.*;

 class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an infix expression: ");
        String infix = scanner.nextLine();
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix expression: " + postfix);

        List<String> quadruple = new ArrayList<>();
        Stack<Integer> operandStack = new Stack<>();
        int tempVarCount = 1;

        for (char c : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                operandStack.push(Character.getNumericValue(c));
            } else if (isOperator(c)) {
                int op2 = operandStack.pop();
                int op1 = operandStack.pop();
                String tempVar = "T" + tempVarCount++;
                quadruple.add(tempVar + " = " + op1 + " " + c + " " + op2);
                operandStack.push(tempVarCount - 1);
            }
        }

        System.out.println("Quadruple Table:");
        for (String entry : quadruple) {
            System.out.println(entry);
        }
    }

    // Define operator precedence
    static Map<Character, Integer> precedence = new HashMap<>();
    static {
        precedence.put('+', 1);
        precedence.put('-', 1);
        precedence.put('*', 2);
        precedence.put('/', 2);
        precedence.put('%', 2);
        precedence.put('^', 3);
    }

    // Function to check if a character is an operator
    static boolean isOperator(char c) {
        return precedence.containsKey(c);
    }

    // Function to convert infix expression to postfix
    static String infixToPostfix(String infix) {
        Stack<Character> operators = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
                postfix.append(' ');
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && isOperator(operators.peek()) &&
                        precedence.get(c) <= precedence.get(operators.peek())) {
                    postfix.append(operators.pop());
                    postfix.append(' ');
                }
                operators.push(c);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    postfix.append(operators.pop());
                    postfix.append(' ');
                }
                if (!operators.isEmpty() && operators.peek() == '(') {
                    operators.pop();
                }
            }
        }

        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
            postfix.append(' ');
        }

        return postfix.toString();
    }
}

