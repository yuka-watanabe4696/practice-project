package basic.q07;

public class MultiplicationTable {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%2d ", i * j); // Format to align the output
			}
			System.out.println(); // Move to the next line after each row
		}
	}
}

