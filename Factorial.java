/* Problem statement
You have been given a positive integer N. You need to find and print the Factorial of this number. The Factorial of a positive integer N refers to the product of all number in the range from 1 to N. You can read more about the factorial of a number here.

Input Format:
The first and only line of the input contains a single integer N denoting the number whose factorial you need to find.

Output Format
Output a single line denoting the factorial of the number N.
*/
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0) {
            System.out.println("Invalid Number");
        }
        else {
            int factorial = 1;
            for (int i = n; i > 0; i--) {
                factorial = factorial * i;

            }
            System.out.println(factorial);
        }
    }
}
