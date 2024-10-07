package practice.q03;

public class Employee {
	// フィールド
	private String name;
	private int age;

	// コンストラクタ
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
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

	// 自己紹介を表示するメソッド
	public void selfIntroduction() {
		System.out.println("氏名：" + name);
		System.out.println("年齢：" + age);
	}
}
