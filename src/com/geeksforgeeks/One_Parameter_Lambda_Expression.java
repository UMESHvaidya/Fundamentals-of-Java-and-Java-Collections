package com.geeksforgeeks;

import java.util.Scanner;

public class One_Parameter_Lambda_Expression {
    public static void main (String[] args) {

        //taking input using Scanner Class
        Scanner sc =new Scanner(System.in);

        //taking count of testcases
        int t=sc.nextInt();

        while(t-->0)
        {
            //taking n
            int n=sc.nextInt();

            //calling helperFunction of class Multiply
            Multiply m=helperFunction();

            //calling method multiplyBy5 of interace Multiply
            System.out.println(m.multiplyBy5(n));
        }
    }
    public static Multiply helperFunction()
    {
        return (p)->p*5;
    }
}
interface Multiply {
    public int multiplyBy5(int n);
}