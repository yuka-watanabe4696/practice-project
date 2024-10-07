package practice.q04;

public class Animal {
	protected String name;
	protected int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showInfo() {
		System.out.println("名前: " + name);
		System.out.println("年齢: " + age);
	}

	public void cry() {
		// 動物ごとの鳴き声はサブクラスで実装
	}
}
