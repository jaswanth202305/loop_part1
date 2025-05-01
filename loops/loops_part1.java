/**
 * Day 01-May-2025 of DSA Journey in Java Author: Jaswanth Date: 01-May-2025
 */
package day1_to_60_in_java;

public class while_in_java {
    public static void main(String[] args) {
        // 1. Print Numbers from 1 to N
        int n = 10;
        number1toN(n);
        // 2. Print Number from N to 1
        numberNto1(n);
        // 3. Sum of Numbers from 1 to N
        sumofnumbers1toN(n);
        // 4. Factorial of a Number
        factorialofN(n);
        // 5. Count Digits in a Number
        countDigitOfN(n);
        // 6. Reverse a Number
        reverseAnumberN(n);
        // 7. Check if a number is Palindrome
        checkPalindromeOfN(n);
        // 8. Sum of Digits
        sumOfDigitOfN(n);
        // 9. Print Even Numbers up to N
        evenNumberUptoN(n);
    }

    static void number1toN(int n) {
        // using for loop

        // for (int i = 1; i <= n; i++) {
        // System.out.println(i);
        // }

        // using while loop

        // int i = 1;
        // while (i <= n) {
        // System.out.println(i);
        // i++;
        // }

        // using do-while loop

        // int i = 1;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= n);
    }

    static void numberNto1(int n) {
        // using for loop

        // for (int i = n; i >= 1; i--) {
        // System.out.println(i);
        // }

        // using while loop

        // int i = n;
        // while (i >= 1) {
        // System.out.println(i);
        // i--;
        // }

        // uisng do-while loop

        // int i = n;
        // do {
        // System.out.println(i);
        // i--;
        // } while (i >= 1);
    }

    static void sumofnumbers1toN(int n) {
        // using for loop

        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum += i;
        //
        // }
        // System.out.println(sum);

        // using while loop

        // int sum = 0;
        // int i = 1;
        // while (i <= n) {
        // sum += i;
        // i++;
        // }
        // System.out.println(sum);

        // using do while loop

        // int sum = 0;
        // int i = 1;
        // do {
        // sum += i;
        // i++;
        // } while (i <= n);
        // System.out.println(sum);
    }

    static void factorialofN(int n) {
        // using for loop

        // int factorial = 1;
        // for (int i = 1; i <= n; i++) {
        // factorial *= i;
        //
        // }
        // System.out.println(factorial);

        // using while loop

        // int factorial = 1;
        // int i = 1;
        //
        // if (n <= 1) {
        // System.out.println(1);
        // } else {
        // while (i <= n) {
        // factorial *= i;
        // i++;
        // }
        // System.out.println(factorial);
        // }

        // using do-while loop

        // int factorial = 1;
        // int i = 1;
        //
        // if (n <= 1) {
        // System.out.println(1);
        // }
        //
        // else {
        // do {
        // factorial *= i;
        // i++;
        // } while (i <= n);
        // }
        // System.out.println(factorial);
    }

    static void countDigitOfN(int n) {

        // using while loop

        // int count = 0;
        // while (n != 0) {
        // int digit = n / 10;
        // count++;
        // n = digit;
        // }
        // System.out.println(count);

        // using do-while loop

        // int count = 0;
        // do {
        // int digit = n / 10;
        // count++;
        // n = digit;
        // } while (n != 0);
        // System.out.println(count);
    }

    static void reverseAnumberN(int n) {

        // using while loop
        // int reverse = 0;
        // while (n != 0) { // 1234 != 0 , 123 != 0 , 12 != 0 , 1 !=0 ,0 != 0 == false exit loop
        // int mod = n % 10; // 1st = 1234 % 10 = 4 , 2nd 123 % 10 = 3, 3rd = 12 % 10 = 2 , 1 % 10
        // // = 1
        // reverse = reverse * 10 + mod;
        // // 0 * 10 + 4 = 4,
        // // 4 * 10 + 3 = 43 ,
        // // 43 * 10 + 2 = 432 ,
        // // 432 *10 + 1 = 4321
        // n = n / 10; // 1234/10 = 123 , 123/10 = 12 , 12/10 = 1
        // }
        // System.out.println(reverse);

        // using do-while loop

        // int reverse = 0;
        // do {
        // int mod = n % 10;
        // reverse = reverse * 10 + mod;
        // n = n / 10;
        // } while (n != 0);
        //
        // System.out.println(reverse);


    }

    static void checkPalindromeOfN(int n) {

        // using while loop

        // int original_Number = n;
        // int reverse = 0;
        // while (n != 0) {
        // int mod = n % 10;
        // reverse = reverse * 10 + mod;
        // n = n / 10;
        // }
        // if (reverse == original_Number) {
        // System.out.println("It is Palindrome");
        // } else {
        // System.out.println("It is not a Palindrome");
        // }

        // using do-while loop

        // int original_number = n;
        // int reverse = 0;
        // do {
        // int mod = n % 10;
        // reverse = reverse * 10 + mod;
        // n = n / 10;
        // } while (n != 0);
        //
        // if (original_number == reverse) {
        // System.out.println("It is a plaindrone");
        // } else {
        // System.out.println("It is not a palindrone");
        // }
    }

    static void sumOfDigitOfN(int n) {
        // using while loop

        // int sumofdigit = 0;
        // int remider = 0;
        //
        // while (n != 0) {
        // sumofdigit = sumofdigit + n % 10;
        // n = n / 10;
        //
        // }
        // System.out.print(sumofdigit);

        // using do_while loop

        // int sum = 0;
        // int reverse = 0;
        //
        // do {
        // sum = sum + n % 10;
        // n = n / 10;
        //
        // } while (n != 0);
        //
        // System.out.println(sum);
    }

    static void evenNumberUptoN(int n) {

        // using for loop

        // for (int i = 2; i <= n; i = i + 2) {
        //
        // System.out.println(i);
        //
        // }

        // using while loop

        // int i = 1;
        // while (i <= n) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // i++;
        // }

        // using while loop just by add number by 2

        // int i = 2;
        // while (i <= n) {
        // System.out.println(i);
        // i = i + 2;
        // }

        // using do-while loop
        // int i = 1;
        // do {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // i++;
        // } while (i <= n);

    }
}

