package method.q06;

public class Circle {
	// 円の面積を計算するメソッド（コンソール出力はしない）
		public static double getCircleArea(double radius) {
			return 3.14 * radius * radius; // 円の面積 = π * 半径^2
		}

		public static void main(String[] args) {
			double radius = 5.0;

			// 面積の計算（getCircleAreaメソッド内では出力しない）
			double area = getCircleArea(radius);

			// コンソール出力
			System.out.println("半径：" + radius);
			System.out.println("円の面積：" + area);
		}
}
