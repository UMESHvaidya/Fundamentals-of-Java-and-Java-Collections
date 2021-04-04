package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class Removing_consecutive_duplicates_2 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Reading number of testcases
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            //Reading the string that needs to processed
            String str = br.readLine().trim();

            //calling the removePair method of class solve
            String ans = removePair(str);

            //if the new processed string is empty
            //then we print "Empty String"
            if(ans.length()<=0)
                System.out.println("Empty String");
                //otherwise we print the new string
            else
                System.out.println(ans);
        }
    }
    public static String removePair(String str){
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        for(Character a:str.toCharArray())
            if (stack.peek() == a)
                stack.pop();
            else stack.push(a);
        for(Character a:stack)
            sb.append(a);
            return sb.reverse().toString();
    }
}
