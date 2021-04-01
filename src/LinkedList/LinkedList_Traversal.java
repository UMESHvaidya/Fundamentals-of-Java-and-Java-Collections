package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Traversal {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking all the testcases
        int t=sc.nextInt();
        while(t-->0)
        {
            //taking the total number of elements
            int n=sc.nextInt();

            LinkedList<Integer> ll=new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                ll.add(sc.nextInt());
            }

            //calling the LikedListTraversal method
            LinkedListTraversal(ll);
            System.out.println();
        }
    }
    public static void LinkedListTraversal(LinkedList<Integer>ll)
    {
        for (Integer integer : ll) {
            System.out.print(integer + " ");
        }
    }
}
