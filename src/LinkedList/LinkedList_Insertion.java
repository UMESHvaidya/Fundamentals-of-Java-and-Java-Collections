package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Insertion {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking the number of testcases
        int t=sc.nextInt();

        while(t-->0)
        {
            //taking input the number the of elements
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                arr.add(sc.nextInt());
            }

            //calling the method insertion
            LinkedList<Integer>ll=insertion(arr);

            //printing all the elements
            for(int i:ll)
                System.out.print(i+" ");
            System.out.println();
        }
    }
    public static LinkedList<Integer> insertion(ArrayList<Integer>arr)
    {
        LinkedList<Integer> lst = new LinkedList<>();
        for(Integer a:arr)
            lst.add(a);

        return lst;
    }
}
