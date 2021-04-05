package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Traversal {
    public static void main (String[] args) {

        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        //taking total number of testcases
        int t=sc.nextInt();
        while(t-->0)
        {
            //taking total number of elements
            int n=sc.nextInt();

            //Creating a Queue
            Queue<Integer> q=new LinkedList<>();

            //adding all the elements to the Queue
            for(int i=0;i<n;i++)
            {
                q.add(sc.nextInt());
            }

            //calling the queueTraversal method
            queueTraversal(q);

            System.out.println();
        }
    }
    public static void queueTraversal(Queue<Integer>q)
    {
       for(Integer i:q)
           System.out.print(i +" ");
    }
}
