package method.q07;

public class SumNumbers2 {
	// 整数型と実数型の引数を加算するメソッド（コンソール出力はしない）
	public static int calculateSum(int intNumber, double doubleNumber) {
		return (int) (intNumber + doubleNumber); // 加算して結果を整数にキャスト
	}

	public static void main(String[] args) {
		int intNumber = 5;
		double doubleNumber = 3.3;

		// 加算の実行（calculateSumメソッド内では出力しない）
		int sum = calculateSum(intNumber, doubleNumber);

		// コンソール出力
		System.out.println("第一引数（整数）：" + intNumber);
		System.out.println("第二引数（実数）：" + doubleNumber);
		System.out.println("加算結果：" + sum);
	}
}
