package basic.q02;

public class SubtractLoop2 {
	public static void main(String[] args) {
		int number = 100;

		// Using do-while loop to decrement from 100 to 0
		do {
			System.out.println(number);
			number--; // Decrement the number
		} while (number >= 0); // Loop continues until number is 0 or less
	}
}
