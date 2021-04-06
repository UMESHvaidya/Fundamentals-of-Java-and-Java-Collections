package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Generate_Binary_Numbers {
    public static void main(String[] args)
    {
        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        //Taking the number of testcases
        int t = sc.nextInt();

        while(t-- > 0)
        {
            //taking the range
            int n = sc.nextInt();

            //creating an ArrayList
            ArrayList<String> res;

            //calling the generate method of class solve
            //and storing the result in an ArrayList
            res = generate(n);

            //printing all the elements of the ArrayList
            for (String re : res) System.out.print(re + " ");
            System.out.println();
        }
    }
    public static ArrayList<String> generate(int N)
    {
        Queue<String> q = new LinkedList<>();
        ArrayList<String> binary = new ArrayList<>();
        q.offer("1");
        for(int i = 0; i < N; ++i){
            String curr = q.poll();
            binary.add(curr);
            q.offer(curr+ "0");
            q.offer(curr+ "1");
        }
        return binary;
    }
}
