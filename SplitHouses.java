import java.util.Scanner;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String s =sc.next();
        if(s.contains("HH")){
            System.out.println("NO");
        }
        else{
            s=s.replace('.','B');
            System.out.println("YES");
            System.out.println(s);
        }

    }
}
