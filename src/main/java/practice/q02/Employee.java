package practice.q02;

public class Employee {
	// フィールド
	private String name;
	private int age;

	// コンストラクタ
	public Employee() {
		// 初期化（特に必要な初期化処理がないため空で定義）
	}

	// 名前を取得するメソッド
	public String getName() {
		return name;
	}

	// 名前を設定するメソッド
	public void setName(String name) {
		this.name = name;
	}

	// 年齢を取得するメソッド
	public int getAge() {
		return age;
	}

	// 年齢を設定するメソッド
	public void setAge(int age) {
		this.age = age;
	}
}
