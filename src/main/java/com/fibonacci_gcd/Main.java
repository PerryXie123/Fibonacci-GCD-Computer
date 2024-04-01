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
    }
}