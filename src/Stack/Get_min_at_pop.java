package Stack;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

import static java.util.Collections.reverse;

public class Get_min_at_pop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //Taking all the testcases
        int t = sc.nextInt();

        while(t-- > 0)
        {
            //Taking total number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];

            //adding all the elements to the array
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            //calling _push method of class GetMin
            //and storing the result in a new Stack
            Stack<Integer> mys = _push(arr,n);

            //calling _getMinAtPop method of class GetMin
                _getMinAtPop(mys);
        }
    }
    public static Stack<Integer> _push(int arr[],int n)
    {
       Stack<Integer> main_stack = new Stack<>();
       for (Integer a:arr)
           main_stack.push(a);
       return main_stack;
    }

    /* print minimum element of the stack each time
       after popping*/
    static void _getMinAtPop(Stack<Integer>main_stack) {
        Stack<Integer> auxilary_stack = new Stack<>();
        for (Integer a : main_stack) {
            if (auxilary_stack.isEmpty())
                auxilary_stack.push(a);
            else if (auxilary_stack.peek() >= a)
                auxilary_stack.push(a);
            else auxilary_stack.push(auxilary_stack.peek());
        }
        while (!auxilary_stack.isEmpty())
            System.out.print(auxilary_stack.pop() +" ");
        System.out.println();
    }
}
