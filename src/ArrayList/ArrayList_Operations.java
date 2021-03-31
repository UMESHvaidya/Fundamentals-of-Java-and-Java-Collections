package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Operations {
    public static void main(String args[])
    {
        //Creating an object of class Scanner
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//Taking number of testcases
        while(T>0)
        {
            ArrayList<Integer> A = new ArrayList<Integer>();//Declaraing and Initializing an ArrayList
            int q = sc.nextInt();//Taking number of queries

            while(q>0)
            {
                char c = sc.next().charAt(0);
                if(c == 'a')
                {
                    int x = sc.nextInt();
                    add_to_ArrayList(A,x);
                }

                if(c == 'b')
                    sort_ArrayList_Asc(A);

                if(c == 'c')
                    reverse_ArrayList(A);

                if(c == 'd')
                    System.out.print(size_Of_ArrayList(A)+" ");

                if(c == 'e')
                    print_ArrayList(A);

                if(c == 'f')
                    sort_ArrayList_Desc(A);

                q--;
            }
            T--;
            System.out.println();
        }
    }
    public static void add_to_ArrayList(ArrayList<Integer> A, int x)
    {
        A.add((Integer) x);
    }

    public static void sort_ArrayList_Asc(ArrayList<Integer> A)
    {
        Collections.sort(A);
    }

    public static void reverse_ArrayList(ArrayList<Integer> A)
    {
        Collections.reverse(A);
    }

    public static int size_Of_ArrayList(ArrayList<Integer> A)
    {
        return A.size();
    }

    public static void sort_ArrayList_Desc(ArrayList<Integer> A)
    {
        Collections.sort(A, Collections.reverseOrder());
    }

    public static void print_ArrayList(ArrayList<Integer> A)
    {
        for(Integer a:A)
            System.out.print(a+" ");
    }
}
