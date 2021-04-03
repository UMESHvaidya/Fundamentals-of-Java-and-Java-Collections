package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Removing_consecutive_duplicates {
    public static void main (String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //taking the length of the string
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){

            //taking the string
            String str = br.readLine().trim();

            //calling removeConsecutiveDuplicates method of class solve
            System.out.println(removeConsecutiveDuplicates(str));
        }
    }
    public static String removeConsecutiveDuplicates(String str){
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0)); ans.append(stack.peek());
        //iterate over elements in the string
        // maintain a stack check every char with stack top if it matches
        // means already present in the string
        for(char c:str.toCharArray())
            if(stack.peek()!=c) {
                stack.push(c);
                ans.append(c);
            }
        return ans.toString();
    }
}
