package jesse_cookies;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Jesse and Cookies
Jesse loves cookies. He wants the sweetness of all his cookies to be greater than value K. To do this, Jesse repeatedly mixes two cookies with the least sweetness. He creates a special combined cookie with:

sweetness = (1 * Least sweet cookie +  2 * 2nd least sweet cookie).

He repeats this procedure until all the cookies in his collection have a sweetness >= K . 
You are given Jesse's cookies. Print the number of operations required to give the cookies a sweetness >= K. Print -1 if this isn't possible.

Input Format:
    The first line consists of integers N, the number of cookies and K, the minimum required sweetness, separated by a space. 
    The next line contains N integers describing the array A where A(i) is the sweetness of the i(th) cookie in Jesse's collection.

Output Format
    Output the number of operations that are needed to increase the cookie's sweetness >= K . 
    Output -1 if this isn't possible.
 */
public class Jesse_Cookies {

    private static int getMinSweetness(int sweetness, PriorityQueue<Integer> Q) {
        int N = 0;
        while (Q.peek() < sweetness) {
            if (Q.size() > 2) {
                int firstLeast = Q.poll();
                int secondLeast = Q.poll();
                int newCookie = firstLeast + 2 * secondLeast;
                N++;
                Q.offer(newCookie);

            } else {
                return -1;

            }
        }
        
        return N;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> Q = new PriorityQueue<Integer>();
        Scanner sc = new Scanner(System.in);
        int numberOfCookies = sc.nextInt();
        int sweetness = sc.nextInt();
        for (int i = 0; i < numberOfCookies; i++) {
            Q.offer(sc.nextInt());
        }

        System.out.println(getMinSweetness(sweetness, Q));
    }
}
