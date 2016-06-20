package alternating_characters;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Alternating Characters
Shashank likes strings in which consecutive characters are different. 
For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters  and  only, 
he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.

Your task is to find the minimum number of required deletions.

Input Format :
    The first line contains an integer T, i.e. the number of test cases. 
    The next T lines contain a string each.

Output Format
    For each test case, print the minimum number of deletions required.
*/
public class Alternating_Characters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String empty = sc.nextLine();
        String[] testCases = new String[T];
        for (int i = 0; i < T; i++) {
            testCases[i] = sc.nextLine();
            int count = 0;
            int start = 0;
            while (start < testCases[i].length() - 1) {
                if (testCases[i].charAt(start) != testCases[i].charAt(start + 1)) {
                    start++;
                } else {
                    count++;
                    start++;
                }
            }
            
            System.out.println(count);
        }
    }
}
