package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Vertical_Sum {
    public static void main (String[] args) {
        //Creating an object of class Scanner
        Scanner sc = new Scanner(System.in);

        //Taking input the total number of testcases
        int t = sc.nextInt();

        while(t-->0)
        {
            //Taking the total number of rows
            int n=sc.nextInt();

            //Declaring and Initalizing an ArrayList
            ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                //Taking the number of columns
                int m=sc.nextInt();

                //Declaring and Intializing an ArrayList for each row
                ArrayList<Integer>temp=new ArrayList<>();

                for(int j=0;j<m;j++)
                {
                    temp.add(sc.nextInt());
                }

                arr.add(temp);
            }

            //Calling the method minimum_verical_sum
            System.out.println(minimum_vertical_sum(arr));
        }
    }
    public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr)
    {
        int ans = Integer.MAX_VALUE;
        int [] maxi = new int[1000];
        for (int i = 0; i <arr.size(); i++) {
           ArrayList<Integer> data = arr.get(i);
            for (int j = 0; j <data.size(); j++) {
                maxi[j] += data.get(j);
            }
        }
        for(int a:maxi){
            if(a<ans && a!=0) ans= a;
        }

       return ans;
    }
}
