package week1.day1;

public class PrimeNumbers {

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int input = 13;

		// Declare a boolean variable flag as false
		boolean flag = false;
		int remainder;

		// Iterate from 2 to half of the input
		for (int i=2; i<=input; i++) {

			// Divide the input with each for loop variable and check the remainder
			remainder = input%i;

			// Set the flag as true when there is no remainder
			// break the iterator
			// Check the flag (Provide a condition)
			if (remainder == 0) {
				flag = true;
				// Print 'Prime' when the condition matches
				System.out.println(i+" is a prime number");
			}

			/*else {

				System.out.println(i +" is not a prime");
			}*/

		}

	}
}