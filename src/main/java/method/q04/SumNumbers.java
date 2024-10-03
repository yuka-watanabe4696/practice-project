package method.q04;

public class SumNumbers {
	public static int calculateSum(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		int firstNumber = 3;
		int secondNumber = 2;

		int result = calculateSum(firstNumber, secondNumber);

		// Output to console
		System.out.println("第一引数：" + firstNumber);
		System.out.println("第二引数：" + secondNumber);
		System.out.println("加算結果：" + result);
	}
}
