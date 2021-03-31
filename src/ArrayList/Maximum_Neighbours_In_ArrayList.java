package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Maximum_Neighbours_In_ArrayList {
    public static void main (String[] args) {
        //Creating an Object of class Scanner
        Scanner sc = new Scanner(System.in);
        //Taking input all the testcases
        int t = sc.nextInt();

        while(t-->0)
        {
            //Taking the total number of elements
            int n=sc.nextInt();

            //Declaring and Initializing an ArrayList of type Integer
            ArrayList<Integer>arr=new ArrayList<>();

            //adding all the elements to the ArrayList
            for(int i=0;i<n;i++)
            {
                arr.add(sc.nextInt());
            }


            //Calling the method maxNeighbour
            ArrayList<Integer> ans=maxNeighbour(arr);

            //Printing the elements
            for(int x:ans)
                System.out.print(x+" ");

            System.out.println();
        }

    }
    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer>arr)
    {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < arr.size() -1; i++)
            lst.add(Math.max(arr.get(i), arr.get(i + 1)));
        return lst;
    }
}
