package SurajSDETJavaProgramPackage;

import java.util.ArrayList;
import java.util.List;

public class CodingQuesSDET {

	public static void main(String[] args) {
		factor();
	}

	public static void factor() {

		int a = 5;
		int b = 0;
		int c =a;

		for (int i = 1; i < 4; i++) {
			
			b = a * (c - i);
			a = b;
			System.out.println(b);
		}

	}

	public static void fibonacci() {

		int a = 1;
		int b = 2;
		int c = 0;

		for (int i = 0; i < 10; i++) {
			c = a + b;
			System.out.println(c);

			a = b;
			b = c;
		}
	}

	public static void palidrome() {

		String ab = "1243443421";
		boolean bc = true;

		for (int i = 0; i <= ab.length() / 2; i++) {

			if (ab.charAt(i) != ab.charAt(ab.length() - 1 - i)) {

				bc = false;
				break;
			}
		}

		if (bc == false) {
			System.out.println("false");
		} else {
			System.out.println("true");

		}
	}
}

////		1. Reverse a String
////		2. Check for Palindrome
////		3. Fibonacci Series
////		4. Factorial of a Number
////		5. Prime Number Check
////		6. Count Vowels and Consonants
////		7. Sort an Array
////		8. Merge Two Arrays
////		9. Find the Largest Element in an Array
////		10. Remove Duplicates from an Array
//		11. Check if a Number is Armstrong
//		12. Reverse a Number
//		13. Calculate Greatest Common Divisor(GCD) of Two Numbers
//		14. Check for Anagram
//		15. Count the Number of Digits in a Number
//		16. Print the Prime Numbers in a Range
//		17. Find the Second Largest Element in an Array
//		18. Swap Two Numbers
//		19. Print the Pascal's Triangle
//		20. Find the Missing Number in an Array
