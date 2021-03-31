package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayList_insertion {
    //Making an of class Scanner
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt(); //taking testcase

		while(t-->0)

    {
        //Taking total number of elements
        int n = sc.nextInt();

        //Declaring and initializing array arr
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }

        //Calling the fillArrayList method
        ArrayList<Integer> ans = fillArrayList(arr, n);

        //Printing the elements of the array
        for (int x : ans)
            System.out.print(x + " ");

        System.out.println();
    }

}
    public static ArrayList<Integer> fillArrayList(int arr[], int n)
    {
        ArrayList<Integer>lst= new ArrayList<>();
        for(int a :arr)
            lst.add(a);

        return lst;
    }

}

