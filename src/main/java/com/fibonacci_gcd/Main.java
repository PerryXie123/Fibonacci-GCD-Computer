package com.fibonacci_gcd;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //Method for computing the GCD of two positive integers, A and B.
    public int GCD(int A, int B){
        //Initialises two positive integers, A and B.
        int a;
        int b;
        int r;

        //Initialises A to be the larger of the two inputs.
        if(A > B){
            a = A;
            b = B;
        }
        else{
            a = B;
            b = A;
        }

        //Base case.
        if(a == b){
            return a;
        }

        //GCD computation
        r = a%b;

        //Recursion conditions
        if(r == 0){
            return b;
        }
        else{
            a = b;
            b = r;
            GCD(a, b);
        }
        return -1;
    }
}