package Queue;

import java.util.*;

public class Reverse_First_K_elements_of_Queue {
    public static void main(String[] args){

        //Taking input using class Scanner
        Scanner sc=new Scanner(System.in);

        //Taking total number of testcases
        int t=sc.nextInt();

        while(t-->0){
            //Taking count of total number of elements
            int n=sc.nextInt();

            //Taking count of total elements
            //that need to be reversed
            int k=sc.nextInt();

            //Creating a Queue
            Queue<Integer> q=new LinkedList<>();

            //adding all the elements to the Queue
            while(n-->0){
                q.add((int)sc.nextInt());
            }



            //calling modifyQueue of class GfG
            //and passing Queue and k as arguments
            //and storing the reuslt in a new Queue
            Queue<Integer> ans = modifyQueue(q,k);

            //Printing all the elements from the
            //new Queue and polling them out
            while(!ans.isEmpty()){
                int a=ans.peek();
                ans.poll();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        Queue<Integer> ans = new LinkedList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < k; i++)
            stack.push(q.poll());
        while (!stack.isEmpty())
            q.offer(stack.pop());
        for (int i = 0; i < q.size() - k; i++)
            q.offer(q.poll());
        return q;
    }
}
