package isbalanced;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Balanced Parentheses
Given a sequence consisting of parentheses, determine whether the expression is balanced. A sequence of parentheses is balanced if every open parentheses can be paired uniquely with a closed parentheses that occurs after the former. Also, the interval between them must be balanced. You will be given three types of parentheses: (, {, and [.
    {[()]} - This is a balanced parentheses.
    {[(])} - This is not a balanced parentheses.
Input Format:
    The first line of input contains the number of test cases, T. Each test case consists of a single line, S, the sequence of parentheses.

Constraints:
    Each character of the sequence will be one of {, }, (, ), [, ].

Output Format:
    For each test case, print on a new line "YES" if the parentheses are balanced. Otherwise, print "NO". Do not print the quotes.
 */
public class IsBalanced {

    public boolean isBlanced(String input) {
        Stack<Character> myStack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '[' || c == '{' || c == '(') {
                myStack.push(c);
                continue;
            }

            if (!myStack.empty()) {
                if (c == ']' && myStack.peek() != '[' || c == '}' && myStack.peek() != '{' || c == ')' && myStack.peek() != '(') {
                    return false;
                } else {
                    myStack.pop();
                }
            } else if (c == ']' || c == '}' || c == ')') {
                return false;
            }
        }

        if (!myStack.empty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String empty = sc.nextLine();
        IsBalanced s = new IsBalanced();

        String[] testCases = new String[count];
        for (int i = 0; i <= count; i++) {
            testCases[i] = sc.nextLine();

            if (s.isBlanced(testCases[i])) {
                System.out.println("Yes");
            } else {
                System.out.println("NO");
            }
        }
    }
}
