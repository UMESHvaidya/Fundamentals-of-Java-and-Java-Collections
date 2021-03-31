package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class List_Of_Smaller_Elements {
    public static void main (String[] args) {

        //Creating an object of Scanner class
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();//taking the number of testcases

        while(t-->0)
        {
            //Declaring and Initializing an ArrayList
            ArrayList<Integer>arr=new ArrayList<>();

            //taking the total number of elements
            int n=sc.nextInt();

            for(int i=0;i<n;i++)
                arr.add(sc.nextInt());

            //taking in the the value of k
            int k=sc.nextInt();

            //calling the getSmaller method
            ArrayList<Integer> ans=getSmaller(arr,k);

            //printing all the numbers which are smaller than k
            for(int i:ans)
                System.out.print(i+" ");

            System.out.println();
        }
    }
    public static  ArrayList<Integer> getSmaller(ArrayList<Integer>arr,int k)
    {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i <arr.size(); i++) {
            if (arr.get(i) < k)
                lst.add(arr.get(i));
        }
        return lst;
    }
}
