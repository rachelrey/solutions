package gemstones;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a lower-case Latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a gem-element if it occurs at least once in each of the rocks.
Given the list of  rocks with their compositions, display the number of gem-elements that exist in those rocks.

Input Format:
    The first line consists of an integer, N, the number of rocks. 
    Each of the next N lines contains a rock's composition. Each composition consists of lower-case letters of English alphabet.

Constraints:
    1 < N < 100
    Each composition consists of only lower-case Latin letters ('a'-'z'). 
    1 < length of each composition < 100 

Output Format:
    Print the number of gem-elements that are common in these rocks. If there are none, print 0.
*/
public class Gemstones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String empty = sc.nextLine();
        String[] testCases = new String[T];
        boolean[] flag = new boolean[26];
        int[] numberOfRepeats = new int[26];
        for (int i = 0; i < T; i++) {
            testCases[i] = sc.nextLine();
            for (int j = 0; j < testCases[i].length(); j++) {
                int ch = (int) testCases[i].charAt(j) - 97;
                if (flag[ch] == false) {
                    numberOfRepeats[ch]++;
                    flag[ch] = true;
                }
            }
            for (int k = 0; k < 26; k++) {
                flag[k] = false;
            }
        }
        int count = 0;
        for (int z = 0; z < 26; z++) {
            if (numberOfRepeats[z] == T) {
                count++;
            }
        }

        System.out.println(count);
    }
}
