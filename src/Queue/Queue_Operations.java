package Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Operations {
    public static void main (String[] args) {

        // Taking input using scanner class
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while(testcase-- > 0){
            // Declaring Queue
            Queue<Integer> q = new LinkedList<>();
            int n = sc.nextInt();

            // Invoking object of Geeks class

            for(int i = 0;i<n;i++){
                int k = sc.nextInt();
                insert(q, k);
            }

            int x = sc.nextInt();
            for(int i = 0;i<x;i++){
                int k = sc.nextInt();
                int f = findFrequency(q, k);
                if(f != 0){
                    System.out.println(f);
                }
                else{
                    System.out.println("-1");
                }
            }
        }
    }
    public static void insert(Queue<Integer> q, int k){
        q.offer(k);
    }

    // Function to find frequency of an element
    // rteturn the frequency of k
    public static int findFrequency(Queue<Integer> q, int k){
        return Collections.frequency(q,k);
    }
}
