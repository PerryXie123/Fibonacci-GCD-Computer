package com.fibonacci_gcd;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initialises variables
        int result;
        int sumA;
        int sumB;
        int fibA;
        int fibB;

        //Takes the user input for the first number
        Scanner numberA = new Scanner(System.in);
        System.out.print("Enter the first number (less than 46): ");
        int A = numberA.nextInt();

        //Takes the user input for the second number
        Scanner numberB = new Scanner(System.in);
        System.out.print("Enter the second number (less than 46): ");
        int B = numberB.nextInt();

        System.out.println("");

        numberA.close();
        numberB.close();
        
        //Calculates the (n+2)th Fibonacci number
        fibA = Fibonacci(A+1);
        fibB = Fibonacci(B+1);

        //Calculates the sum of the first nth Fibonacci numbers
        sumA = fibA-1;
        sumB = fibB-1;

        System.out.println("The sum of the first " + A + " Fibonacci numbers is: " + sumA);
        System.out.println("The sum of the first " + B + " Fibonacci numbers is: " + sumB);

        System.out.println("");

        //Calculates the GCD of the two summed Fibonacci numbers
        result = GCD(sumA, sumB);
        System.out.println(""); 
        System.out.println("GCD(" + sumA + ", " + sumB + ") = " + result);
    }
    //Method for computing the nth Fibonacci number
    public static int Fibonacci(int n){
        //Base case
        if(n <= 1){
            return n;
        }
        //Iteration

        int fib = 1;
        int fibPrevious = 1;

        for(int i = 2; i < n; i++){
            int temp = fib;
            fib += fibPrevious;
            fibPrevious = temp;
        }

        return fib;
    }

    //Method for computing the GCD of two positive integers, A and B.
    public static int GCD(int A, int B){
        //Initialises two positive integers, A and B.
        int a;
        int b;
        int q;
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

        //Quotient computation
        q = (a-r)/b;

        //Output comments
        System.out.println(String.format("Dividend: %d, Divisor: %d, Quotient: %d, Remainder: %d", a, b, q, r));
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