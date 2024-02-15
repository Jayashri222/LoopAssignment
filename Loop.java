Loop  Assignment 
Q1. Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.
Ans- import java.util.Scanner;


   public class SumOfNaturalNumbers {
            public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
        
                System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
           for (int i = 1; i <= n; i++) {
            sum += i;
      }
System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        
        scanner.close();
    }
}
Q2. Write a Java program to print a multiplication table for a given number 'n'.
Ans. import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number for multiplication table: “)
int n = scanner.nextInt();
        
               System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        
        scanner.close();
    }
}
Q3. Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.
import java.util.Scanner;


public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int gcd = findGCD(num1, num2); // Call the function to find GCD
        
        // Print the GCD
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        
        scanner.close();
    }
    
    // Function to find the GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
Q4. Write a Java program to check if a given string is a palindrome or not using a loop.


import java.util.Scanner;


public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Check if the entered string is a palindrome
        boolean isPalindrome = checkPalindrome(str);
        
        // Print the result
        if (isPalindrome) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
    
    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}


Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series.
Ans. import java.util.Scanner;


public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Check if the entered string is a palindrome
        boolean isPalindrome = checkPalindrome(str);
        
        // Print the result
        if (isPalindrome) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
    
    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}