package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_Iterate_Fron_to_Back {
    public static void main (String[] args) {

        //Creating an object of class Scanner
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//taking all the testcases

        while(t-->0)
        {
            int n=sc.nextInt();//taking the total number of elements
            ArrayList<Integer> arr=new ArrayList<>();//Declaring and Intializing an ArrayList
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();//taking in the element
                arr.add(x);
            }

            Iterator iterator=arr.iterator();//creating an iterator of ArrayList arr

            //calling the iterFTB method and passing the iteraror
            iterFTB(iterator);

            System.out.println();
        }

    }
    public static void iterFTB(Iterator iterator)
    {
        while (iterator.hasNext())
            System.out.print(iterator.next() +" ");
    }
}
