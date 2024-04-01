package com.fibonacci_gcd;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //Method for computing the GCD of two positive integers, A and B.
    public void GCD(int a, int b){
        //Initialises two positive integers, A and B.
        int A;
        int B;

        //Initialises A to be the larger of the two inputs.
        if(a > b){
            A = a;
            B = b;
        }
        else{
            A = b;
            B = a;
        }
    }
}