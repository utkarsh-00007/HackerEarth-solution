/*
Problem
You are provided an array A of size N that contains non-negative integers. Your task is to determine whether the number
that is formed by selecting the last digit of all the N numbers is divisible by 10.

Note: View the sample explanation section for more clarification.

Input format

First line: A single integer N denoting the size of array A
Second line: N space-separated integers.
Output format

If the number is divisible by 10, then print Yes. Otherwise, print No.
*/

import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(arr[n-1]%10==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
