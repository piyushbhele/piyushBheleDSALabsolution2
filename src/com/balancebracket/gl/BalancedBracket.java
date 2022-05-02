package com.balancebracket.gl;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBracket {

    //checking if brackets are balanced or not
    public boolean areBracketsBalanced(String expression) {
        Deque<Character> stack = new ArrayDeque<>();

        //traversing
        for (int i = 0; i < expression.length(); i++) {
            char x = expression.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                //push element in stack
                stack.push(x);
                continue;
            }

            //
            if (stack.isEmpty()) {
                return false;
            }

            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '[' || check == '{')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '[' || check == ')')
                        return false;
                    break;

            }
        }
        return stack.isEmpty();
    }
}