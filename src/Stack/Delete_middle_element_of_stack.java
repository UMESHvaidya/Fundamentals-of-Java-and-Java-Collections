package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Delete_middle_element_of_stack {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int sizeOfStack = sc.nextInt();
            Stack<Integer> myStack = new Stack<>();

            //adding elements to the stack
            for (int i = 0; i < sizeOfStack; i++) {
                int x = sc.nextInt();
                myStack.push(x);

            }
            deleteMid(myStack, sizeOfStack);

            while (!myStack.isEmpty()) {
                System.out.print(myStack.peek() + " ");
                myStack.pop();
            }
            System.out.println();
        }
    }
        public static void deleteMid(Stack<Integer>s,int sizeOfStack){
            if(sizeOfStack%2!=0)
                s.remove(sizeOfStack/2);
            else{
                s.remove((sizeOfStack -1)/2);
            }
            //  Collections.reverse(s);
        }

}
