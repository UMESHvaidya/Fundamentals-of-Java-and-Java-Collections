package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Stack_designer {
    public static void main (String[] args) {


    Scanner sc=new Scanner(System.in);

    int t=sc.nextInt();

    while(t-->0)
    {
        //Creating an ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        //Taking input the total number of elements
        int n = sc.nextInt();

        //adding all the elements to the ArrayList
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            arr.add(x);
        }

        //Calling the push method and passing
        //ArrayList and the it's size
        Stack<Integer> mys = _push(arr,n);

        //Calling the pop method
        //and passing Stack
        _pop(mys);

        System.out.println();
    }
    }
    public static Stack<Integer>_push(ArrayList<Integer> arr,int n)
    {
       Stack<Integer> stack = new Stack<>();
       for(Integer a:arr)
           stack.push(a);
        return stack;
    }
    public static void _pop(Stack<Integer>stack)
    {
        while (!stack.empty())
            System.out.print(stack.pop()+ " ");
    }

}
