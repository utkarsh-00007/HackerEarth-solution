/* Problem
Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.

Sample Input
1
2
88
42
99
Sample Output
1
2
88
Time Limit: 5
Memory Limit: 256
*/
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
       // int a= sc.nextInt();
        int i=0;
        while (true){
            int n = sc.nextInt();
            if (n!=42){
                System.out.println(n);
            }
            else{
                break;
            }
            i++;
        }
    }
}
