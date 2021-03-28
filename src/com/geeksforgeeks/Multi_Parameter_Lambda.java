package com.geeksforgeeks;

import java.util.Scanner;

public class Multi_Parameter_Lambda {
    public static void main (String[] args) {

        //taking input using Scanner class
        Scanner sc =new Scanner(System.in);

        //taking total count of testcases
        int t=sc.nextInt();

        while(t-->0)
        {
            //taking the first number
            int x=sc.nextInt();

            //taking the second number
            int y=sc.nextInt();

            //calling helperFunction which adds
            //the two number and return the object
            Add a=helperFunction();

            //calling interface function to print
            //the answer
            System.out.println(a.addParameters(x,y));
        }
    }
    public static Add helperFunction(){
        return (x,y) -> x + y;
    }
}

interface Add{
    public int addParameters(int x,int y);
}
