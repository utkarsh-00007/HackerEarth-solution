/*
Problem
You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.

Constraints 1 <= |S| <= 100

Note
String S consists of lowercase English Alphabets only.
*/

import java.util.Scanner;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        s=s.toLowerCase();
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==s.charAt(s.length()-1-i)){
//                System.out.println("YES");
                flag = true;
            }
            else {
//                System.out.println("NO");
                flag = false;
            }
        }
        if (flag==true){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        
    }
}
