package health;

import java.util.Stack;

//Please find the minimum number of parentheses that need to be added
// to the string to make it valid ? Assume length of string is < 1000.
public class MinParenthesis {

    public static void main(String [] args) throws Exception {
        System.out.println(minParenthesis("(()(()((()"));
        System.out.println(minParenthesis("(((((((((((((((((((("));
        System.out.println(minParenthesis(")))))()"));
    }

    private static int minParenthesis(String parenthesis) throws Exception {

        if (parenthesis == null)
            throw new Exception("parameter must not be null");
        else if (parenthesis.isEmpty())
            return 0;

        Stack<Character> stack = new Stack<>();
        int minParenth = 0;

        for (int i = 0; i < parenthesis.length(); i++) {

            char c = parenthesis.charAt(i);

            if (c == ')') {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '$' : stack.pop();

                if (topElement == '$')
                    minParenth++;
                else if (topElement == '(')
                    minParenth--;
                else
                    minParenth++;

            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
                minParenth++;
            }
        }

        return minParenth;
    }
}
