package stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isCorrect=true;

        for (int i = 0; i <s.length(); i++) {
            if (stack.isEmpty() && (s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']')){
                return false;
            }
            else {
                if ((!stack.isEmpty())&&(stack.peek()=='(' && s.charAt(i)==')') ||
                        (!stack.isEmpty())&&   (stack.peek()=='{' && s.charAt(i)=='}') ||
                        (!stack.isEmpty())&&  (stack.peek()=='[')&& s.charAt(i)==']'){
                    stack.pop();
                }
                else {
                    stack.push(s.charAt(i));
                }

            }
        }
        System.out.println(stack);
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        System.out.println(obj.isValid("())()"));
    }
}
