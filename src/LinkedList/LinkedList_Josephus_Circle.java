package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LinkedList_Josephus_Circle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking all the testcases
        int t = sc.nextInt();

        while(t-->0)
        {
            //taking input total number people
            int n=sc.nextInt();

            //taking input interval number
            int k=sc.nextInt();

            //calling the method josephus
            System.out.println(josephus(n,k));
        }
    }
    public static int josephus(int n, int k)
    {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++)
            lst.add(i);
        Iterator it = lst.iterator();
        while (lst.size() > 1){
            int ptr = 0;
            while (ptr < k) {
                while (it.hasNext() && ptr < k) {
                    it.next();
                    ptr++;
                }
                // we end up the list but k is not achieved so start again from the start
                if (ptr < k) {
                    it = lst.iterator();
                    it.next();
                    ptr++;
                }
            }
            it.remove();
        }
        return lst.get(0);
    }
}
