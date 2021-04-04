package Stack;

import java.util.Arrays;
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
        char arr []  = new char[x.length()];int index = 0;
        for(char a:x.toCharArray()) {
            if ("({[".contains(a + "")){
                arr[index++] = a;
                System.out.println(Arrays.toString(arr));
        }
            else {
                if (index == 0)
                    return false;
                if (a == ')' && arr[index - 1] != '(') return false;
                if (a == ']' && arr[index - 1] != '[') return false;
                if (a == '}' && arr[index - 1] != '{') return false;
                else {
                    arr[index - 1] = 0;
                    index --;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return index == 0;
    }
}
