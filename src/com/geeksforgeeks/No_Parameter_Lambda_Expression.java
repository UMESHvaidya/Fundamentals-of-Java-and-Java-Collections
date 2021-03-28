package com.geeksforgeeks;

import java.util.Scanner;

public class No_Parameter_Lambda_Expression {

    public static void main (String[] args) {

        //taking input using Scanner class
        Scanner sc =new Scanner(System.in);

        //taking testcases count
        int t = sc.nextInt();
        while(t-->0)
        {
            //calling helperFunction of class Hello
            Hello h = helperFunction();
            //calling Interface method
            h.sayHello();
        }
    }
    public static Hello helperFunction()
    {
        return () ->System.out.println("Hello");
    }
}
interface Hello {
    public void sayHello();
}
