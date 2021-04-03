package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Operation_On_Stack {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            // Declaring stack of integers
            Stack<Integer> st = new Stack<>();
            int q = sc.nextInt();

            // Working with queries
            while(q-- > 0)
            {

                char ch = sc.next().charAt(0);

                //Creating an object of class Geeks
                if(ch == 'i')
                {
                    int x = sc.nextInt();

                    //calling insert method of class geeks
                    insert(st, x);
                }

                if(ch == 'r')
                {
                    //calling remove method of class geeks
                    remove(st);
                }

                if(ch == 'h')
                {
                    //calling headOf_Stack method of class geeks
                    headOf_Stack(st);
                }
                if(ch == 'f')
                {
                    int x = sc.nextInt();

                    //Printing Yes if the value x
                    //is in the Stack else No
                    if(find(st, x))
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
            }
        }
    }
    public static void insert(Stack<Integer> st, int x)
    {
        st.push(x);
    }

    // Function to pop element from stack
    public static void remove(Stack<Integer> st)
    {
        int x = st.pop();
    }

    // Function to return top of stack
    public static void headOf_Stack(Stack<Integer> st)
    {
        int x = st.peek();
        System.out.println(x + " ");
    }

    // Function to find the element in stack
    public static boolean find(Stack<Integer> st, int val)
    {
        boolean exists = false;
        if(st.contains(val))
            exists = true;
        if(exists){
            return true;
        }
        else{
            return false;
        }

    }
}
