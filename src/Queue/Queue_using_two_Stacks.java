package Queue;

import java.util.Scanner;
import java.util.Stack;

public class Queue_using_two_Stacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public static void main(String args[])
    {
        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        //Taking input the number of testcases
        int t = sc.nextInt();
        while(t-->0)
        {

            //Taking input the total number of Queries
            int q = sc.nextInt();
            while(q>0)
            {
                int QueryTyoe = sc.nextInt();

                //If QueryTyoe is 1 then
                //we call the Push method
                //of class StackQueue
                //else we call the Pop method
                if(QueryTyoe == 1)
                {
                    int a = sc.nextInt();
                    Push(a);
                }else
                if(QueryTyoe == 2)
                    System.out.print(Pop()+" ");
                q--;

            }
            System.out.println();
        }
    }
    public static void Push(int x)
    {
        while(!s1.isEmpty())
            s2.push(s1.pop());
        s1.push(x);
        while(!s2.isEmpty())
            s1.push(s2.pop());
    }


    //Function to pop an element from queue by using 2 stacks.
    public static int Pop()
    {
        if(s1.isEmpty())
            return -1;
        else return s1.pop();
    }
}
