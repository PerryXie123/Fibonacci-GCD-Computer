Input Bounds:
    -Must be a natural number (zero inclusive).
    -Must be less than 46.

User Compilation and Exec Instructions (Windows Only):
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
    Enter the first number (less than 46): 7
    Enter the second number (less than 46): 4
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

        //Introduce new bounds: input must be less than 46

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