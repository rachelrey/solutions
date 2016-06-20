package funny_string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Funny String
Suppose you have a String, S , of length N that is indexed from 0 to N-1. You also have some String, R, that is the reverse of String S. S is funny if the condition | S[i] - S[i-1] | = | R[i] - R[i-1] | is true for every character from 1 to N-1 .

Note: For some String S, S[i] denotes the ASCII value of the i(th) 0-indexed character in S. The absolute value of an integer, x, is written as |x|.

Input Format:
    The first line contains an integer, T (the number of test cases). 
    Each line i of the T subsequent lines contain a string, S.
Output Format
    For each String S(j)(where 0 <= j <= T-1 ), print whether it is  or  on a new line.
 */
public class Funny_String {

    public void isFunny(String testCase) {
        int j = 1;
        int k = 1;
        String reversed = new StringBuilder(testCase).reverse().toString();
        while (k < testCase.length() && j == 1) {
            int original = Math.abs((int) testCase.charAt(k) - (int) testCase.charAt(k - 1));
            int reverse = Math.abs((int) reversed.charAt(k) - (int) reversed.charAt(k - 1));
            if (original != reverse) {
                j--;
            } else {
                k++;
            }
        }
        if (j == 1) {
            System.out.println("Funny");
        } else {
            System.out.println("Not Funny");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String empty = sc.nextLine();
        String[] testCases = new String[T];
        for (int i = 0; i < T; i++) {
            testCases[i] = sc.nextLine();
            Funny_String s = new Funny_String();
            s.isFunny(testCases[i]);
        }
    }
}
