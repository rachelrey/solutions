package anagram;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Anagram
Sid is obsessed with reading short stories. Being a CS student, he is doing some interesting frequency analysis with the books. He chooses strings S1 and S2 in such a way that |len(S1) - len(S2)| <= 1.

Your task is to help him find the minimum number of characters of the first string he needs to change to enable him to make it an anagram of the second string.

Note: A word x is an anagram of another word y if we can produce y by rearranging the letters of x.

Input Format: 
    The first line will contain an integer, T, representing the number of test cases. Each test case will contain a string having length len(S1) + len(S2) , which will be concatenation of both the strings described above in the problem.The given string will contain only characters from  to .

Output Format: 
    An integer corresponding to each test case is printed in a different line, i.e. the number of changes required for each test case. Print -1 if it is not possible.
 */
public class Anagram {

    public void numberOfActions(String testCase) {
        int count = 0;
        int mid = testCase.length() / 2;
        int[] lettersFirst = new int[26];
        int[] lettersSecond = new int[26];
        String first = testCase.substring(0, mid);
        String second = testCase.substring(mid, 2 * mid);
        for (int j = 0; j < mid; j++) {
            int ch = (int) first.charAt(j) - 97;
            lettersFirst[ch]++;
        }
        for (int k = 0; k < mid; k++) {
            int ch = (int) second.charAt(k) - 97;
            lettersSecond[ch]++;
        }
        for (int z = 0; z < 26; z++) {
            count = count + Math.abs(lettersSecond[z] - lettersFirst[z]);
        }
        System.out.println(count / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String empty = sc.nextLine();
        String[] testCases = new String[T];
        for (int i = 0; i < T; i++) {
            testCases[i] = sc.nextLine();
            if (testCases[i].length() % 2 == 1) {
                System.out.println("-1");
            } else {
                Anagram s = new Anagram();
                s.numberOfActions(testCases[i]);
            }
        }
    }
}
