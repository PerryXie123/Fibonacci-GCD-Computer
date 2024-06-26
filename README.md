Input Bounds:
    -Must be a natural number (zero inclusive).
    -Must be less than 46.

User Compilation and Exec Instructions (Windows Only):
    Prerequisite: Have JDK version 17 installed.
    1. Download Maven version 3.9.6 from the official Maven website.
    2. Extract the downloaded file to Program Files.
    3. Navigate to the bin folder inside the extracted file.
    4. Copy the file directory.
    5. In Control Panel, navigate to "Edit environment variables for your account".
    6. Go to path, then Edit, then paste in the file directory as a new line.
    7. Click Ok, then Ok.
    8. To check if Maven is successfully installed, type "mvn -v" in cmd.
    9. Locate the project file directory, then in cmd, type "cd <directory>", replacing <directory> with the location of the project file.
    10. Run the program using "mvn clean compile exec:java@run"

Program Instructions:
    1. Input a number under 46 for which the number of Fibonacci numbers should be summed.
    2. Input another number under 46 for which the number of Fibonacci numbers should be summed.

Program Example:
    Enter an integer between 0 and 46: 7
    Enter another integer between 0 and 46: 4
    Output:
        The sum of the first 7 Fibonacci numbers is: 20
        The sum of the first 4 Fibonacci numbers is: 4

        Dividend: 20, Divisor: 4, Quotient: 5, Remainder: 0

        GCD(20, 4) = 4
    Program Check:
        Sum of first 7 Fibonacci Numbers = 0 + 1 + 1 + 2 + 3 + 5 + 8 = 20
        Sum of first 4 Fibonacci Numbers = 0 + 1 + 1 + 2 = 4
        a = 20, b = 4, q = 5, r = 0
        Returns b = 4 when r = 0

///////////////////////////////////////////////////////////////////////////////////////////////

Test Documentation:
    Calculating Nth Fibonacci Number (Recursion):
        Input: 5
        Output: 3
        Check: 0, 1, 1, 2, 3

        Input: 7
        Output: 8
        Check: 0, 1, 1, 2, 3, 5, 8

        Input: 12
        Output: 89
        Check: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

        Input: 30
        Output: 832040

        Input: 42
        Output: 267914296

        NOTES:
            //Recursive process for generating Fibonacci Numbers is relatively slow after the 40th-ish number.
            //Try to use a more time efficient process next.

    Calculating Nth Fibonacci Number (Iteration):
        Input: 5
        Output: 3
    
        Input: 7
        Output: 8
        
        Input: 12
        Output: 89

        Input: 30
        Output: 832040

        Input: 42
        Output: 267914296

        NOTES:
            //Iterative process for calculating Fibonacci Numbers is much more time efficient than recursion.
            //Iterative process also gives the same answers as recursion.
            //Future Fibonacci generation will be done with iteration.


    Calculating GCD (Recursion):
        Input: GCD(5, 2)
        Output: 1
        Check:
        a = 5, b = 2, q = 2, r = 1
        a = 2, b = 1, q = 2, r = 0
        Returns b = 1 when r = 0

        Input: GCD(10, 8)
        Output: 2
        Check:
        a = 10, b = 8, q = 1, r = 2
        a = 8, b = 2, q = 4, r = 0
        Returns b = 2 when r = 0

        Input: GCD(203, 46)
        Output: 1

        NOTES:
            //Recursive process for calculating GCD is quite efficient.
            //Follows the Euclidean algorithm steps to calculate GCD.
            //Used the Scanner class to take user inputs, rather than having to manually change the Main class.

    Calculating sum of first N Fibonacci Numbers (Iteration):
        Input: 4
        Output: 4
        Check: 0 + 1 + 1 + 2 = 4

        Input: 7
        Output: 20
        Check: 0 + 1 + 1 + 2 + 3 + 5 + 8 = 20

        Input: 12
        Output: 232
        Check: 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 = 232

        Input: 40
        Output: 165580140

        Input: 50
        Output: ERROR

        Input: 45
        Output: 1836311902

        Input: 46
        Output: ERROR

        NOTES:
            //Introduced new bounds, input numbers must be lower than 46.
            //Generating the largest sum within bounds (first 45 Fibonacci Numbers) is very fast.

    Calculating GCD of two sums of the first N Fibonacci Numbers with output comments:
        Input: 7, 4
        Output:
            The sum of the first 7 Fibonacci numbers is: 20
            The sum of the first 4 Fibonacci numbers is: 4

            Dividend: 20, Divisor: 4, Quotient: 5, Remainder: 0

            GCD(20, 4) = 4
        Check:
            Sum of first 7 and 4 Fibonnaci Numbers proved prior.
            a = 20, b = 4, q = 5, r = 0
            Returns b = 4 when r = 0

        Input: 12, 7
        Output:
            The sum of the first 12 Fibonacci numbers is: 232
            The sum of the first 7 Fibonacci numbers is: 20

            Dividend: 232, Divisor: 20, Quotient: 11, Remainder: 12
            Dividend: 20, Divisor: 12, Quotient: 1, Remainder: 8
            Dividend: 12, Divisor: 8, Quotient: 1, Remainder: 4
            Dividend: 8, Divisor: 4, Quotient: 2, Remainder: 0

            GCD(232, 20) = 4
        Check:
            Sum of first 20 and 7 Fibonacci Numbers proved prior.
            a = 232, b = 20, q = 11, r = 12
            a = 20, b = 12, q = 1, r = 8
            a = 12, b = 8, q = 1, r = 4
            a = 8, b = 4, q = 2, r = 0
            Returns b = 4 when r = 0

        Input: 30, 25
        Output:
            The sum of the first 30 Fibonacci numbers is: 1346268
            The sum of the first 25 Fibonacci numbers is: 121392

            Dividend: 1346268, Divisor: 121392, Quotient: 11, Remainder: 10956
            Dividend: 121392, Divisor: 10956, Quotient: 11, Remainder: 876
            Dividend: 10956, Divisor: 876, Quotient: 12, Remainder: 444
            Dividend: 876, Divisor: 444, Quotient: 1, Remainder: 432
            Dividend: 444, Divisor: 432, Quotient: 1, Remainder: 12
            Dividend: 432, Divisor: 12, Quotient: 36, Remainder: 0

            GCD(1346268, 121392) = 12

        Input: 45, 20
        Output:
            The sum of the first 45 Fibonacci numbers is: 1836311902
            The sum of the first 20 Fibonacci numbers is: 10945

            Dividend: 1836311902, Divisor: 10945, Quotient: 167776, Remainder: 3582
            Dividend: 10945, Divisor: 3582, Quotient: 3, Remainder: 199
            Dividend: 3582, Divisor: 199, Quotient: 18, Remainder: 0

            GCD(1836311902, 10945) = 199

        Input: 46, 20
        Output: ERROR

        Input: -1, 3
        Output: ERROR

        Input: abc, def
        Output: ERROR

        NOTES:
            //Incorporating the Fibonacci summation method and GCD computation method together works very well.
            //The iterative process and recursive process for Fibonacci and GCD respectively are quite efficient.
            //Obviously, invalid inputs such as non-integers, or integers outside the bounds, outputs an error.
            //Implemented valid input check to fix this.

Solution for Fibonacci Summation:
    The solution I used to sum the first N Fibonacci Numbers was the following equation:
        Sum of the first N Fibonacci Numbers = (N+2)th Fibonacci Number - 1
    This equation eliminated the need to manually sum up an array of numbers, which would've been extremely inefficient.
    This also meant that I didn't need to generate and store a whole bunch of numbers.
    To prove this equation is valid, lets look at a few examples:
        Example 1:
            Sum of the first 4 Fibonacci Numbers.
            The sum of the first 4 Fibonacci Numbers is:
                0 + 1 + 1 + 2 = 4
            The (4+2)th Fibonacci Number is 0, 1, 1, 2, 3, <5>
                5 - 1 = 4

        Example 2:
            Sum of the first 9 Fibonacci Numbers.
            The sum of the first 9 Fibonacci Numbers is:
                0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
            The (9+2)th Fibonacci Number is 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, <55>
                55 - 1 = 54

Solution for GCD computation:
    The method I used for calculating GCD was the Euclidean Algorithm. Here are some examples:
        Example 1:
            GCD(232, 20)
            Firstly, the Dividend is initialised to be the greater of the two numbers, while the Divisor is initialised to be the lesser.
            Dividend = 232, Divisor = 20
            Next, the Euclidean Algorithm states that while the remainder of Dividend/Divisor != 0, the new Dividend becomes the Divisor, and then new Divisor becomes the remainder of Dividend/Divisor. The process is then repeated.
            Thus, for the above example:
                Dividend: 232, Divisor: 20, Quotient: 11, Remainder: 12
                Dividend: 20, Divisor: 12, Quotient: 1, Remainder: 8
                Dividend: 12, Divisor: 8, Quotient: 1, Remainder: 4
                Dividend: 8, Divisor: 4, Quotient: 2, Remainder: 0
            The remainder is zero, and so the final Divisor is returned. Thus GCD(232, 20) = 4

        Example 2:
            GCD(4, 33)
            Dividend = 33, Divisor = 4
            Dividend: 33, Divisor: 4, Quotient: 8, Remainder: 1
            Dividend: 4, Divisor: 1, Quotient: 4, Remainder: 0
            GCD(4, 33) = 1       

Major Changes for increased efficiency and ease of use:
    -Changed the Fibonacci generation process from recursion to iteration.
    -Used a Scanner class to take user inputs from the terminal.
    -Used the same iteration process to generate the sum of the first N Fibonacci Numbers.
    -Introduced new bounds for user inputs.
    -Incoporated a check for invalid inputs.