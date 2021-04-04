package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Parenthesis_Checker {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Reading total number of testcases
        int t= sc.nextInt();

        while(t-- >0)
        {
            //reading the string
            String st = sc.next();

            //calling ispar method of Paranthesis class
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(ispar(st))
                System.out.println("balanced");
            else
                System.out.println("not balanced");

        }
    }
    public static boolean ispar(String x)
    {
        Deque<Character> stack = new ArrayDeque<>();
        for(Character a:x.toCharArray()){
            if ("({[".contains(a+""))
                stack.push(a);
            else{
                if (stack.isEmpty()) return false;
                if (a ==')' && stack.pop()!='(') return false;
                if (a ==']' && stack.pop()!='[') return false;
                if (a =='}' && stack.pop()!='{') return false;
            }
        }
        return stack.isEmpty();
    }
}
