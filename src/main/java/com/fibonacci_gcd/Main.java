package com.fibonacci_gcd;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        int sumA;
        int sumB;
        int fibA;
        int fibB;

        Scanner numberA = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int A = numberA.nextInt();

        Scanner numberB = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int B = numberB.nextInt();

        numberA.close();
        numberB.close();
        
        fibA = Fibonacci(A+1);
        fibB = Fibonacci(B+1);

        sumA = fibA-1;
        sumB = fibB-1;

        System.out.println("The sum of the first " + A + " Fibonacci numbers is: " + sumA);
        System.out.println("The sum of the first " + B + " Fibonacci numbers is: " + sumB);

        result = GCD(A, B);
        System.out.println("GCD(" + A + ", " + B + ") = " + result);
    }
    //Method for computing the nth Fibonacci number
    public static int Fibonacci(int n){
        //Base case
        if(n <= 1){
            return n;
        }
        else{
            return (Fibonacci(n-1) + Fibonacci(n-2));
        }
    }

    //Method for computing the GCD of two positive integers, A and B.
    public static int GCD(int A, int B){
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
            return GCD(a, b);
        }
    }
}