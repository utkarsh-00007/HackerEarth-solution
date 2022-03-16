/*
Problem
You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

Input Format
The first and only line of input contains the String S

Output Format
Print the resultant String on a single line.
*/

import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1 =s.toUpperCase();
//        String s2 =s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==s1.charAt(i)){
                System.out.print(s.toLowerCase().charAt(i));
            }
            else {
                System.out.print(s.toUpperCase().charAt(i));
            }
        }
    }
}
