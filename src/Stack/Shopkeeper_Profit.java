package Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Shopkeeper_Profit {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking the number of testcases
        int t=sc.nextInt();

        while(t-->0)
        {
            //Creating an ArrayList
            ArrayList<Integer> v = new ArrayList<>();

            //Taking the number of elements
            int n = sc.nextInt();

            //adding all the elements to the ArrayList
            for(int i=0;i<n;i++)
            {
                int x = sc.nextInt();
                v.add(x);
            }
            //calling the method profit
            //and printing the result
            System.out.println(profit(v));
        }
    }
    public static int profit(ArrayList<Integer> v)
    {
        int max_profit = v.get(v.size()-1);
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(v.get(v.size()-1));
        for (int i = v.size()-2; i >= 0 ; i--) {
            while (!stack.isEmpty() && v.get(i) > stack.peek())
                stack.pop();
            int val = stack.isEmpty() ? v.get(i):(stack.peek() - v.get(i));
            max_profit += val;
            stack.push(v.get(i));
        }
        return max_profit;
    }
}
