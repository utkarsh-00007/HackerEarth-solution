/*
Problem
You have been given 3 integers - l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k. You do not need to print these numbers, you just have to find their count.

Input Format
The first and only line of input contains 3 space separated integers l, r and k.

Output Format
Print the required answer on a single line.

Constraints
1 <= l <= r <= 1000
1 <= k <= 1000
Sample Input
1 10 1
Sample Output
10
*/

import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();
        int count =0;
        for (int i = l; i < r+1; i++) {
            if (i%k==0){
                count++;
            }
        }
        System.out.println(count);


    }
}
