package method.q10;

import java.util.Arrays;

public class EvenNumber {
	public static int getEvenNumbers(int[] numbers) {
		int count = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				count++; // Increment count for each even number
			}
		}
		return count; // Return the total count of even numbers
	}

	public static void main(String[] args) {
		int[] numbers = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 }; // Given array
		int evenCount = getEvenNumbers(numbers); // Call the method to get the count of even numbers

		// Output the result
		System.out.println(Arrays.toString(numbers) + "には、偶数が" + evenCount + "個あります。");
	}
}
