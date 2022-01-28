/*
Alice got a number written in seven segment format where each segment was creatted used a matchstick.

Example: If Alice gets a number 123 so basically Alice used 12 matchsticks for this number.

Alice is wondering what is the numerically largest value that she can generate by using at most the matchsticks that she currently possess.Help Alice out by telling her that number.

 

Input Format:

First line contains T (test cases).

Next T lines contain a Number N.

Output Format:

Print the largest possible number numerically that can be generated using at max that many number of matchsticks which was used to generate N.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
    
        int arr[]=new int[]{6,2,5,5,4,5,6,3,7,6};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        StringBuilder str=new StringBuilder("");
        while(test--!=0)
        {
            int count=0;
            String st=br.readLine();
            for(int i=0; i<st.length(); i++)
            {
                count+=arr[st.charAt(i)-'0'];
            }
            if(count%2==1)
            {
                str.append("7");
                count-=3;
                for(int i=0; i<count; i+=2)
                {
                    str.append("1");
                }
            }
            else
            {
                for(int i=0; i<count; i+=2)
                {
                    str.append("1");
                }
            }
            str.append("\n");
        }
        System.out.println(str);
    }
}
