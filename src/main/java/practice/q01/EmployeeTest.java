package practice.q01;

public class EmployeeTest {
	public static void main(String[] args) {
		// Employeeオブジェクト e1 の作成
		Employee e1 = new Employee();
		e1.name = "山田";
		e1.age = 20;

		// Employeeオブジェクト e2 の作成
		Employee e2 = new Employee();
		e2.name = "鈴木";
		e2.age = 30;

		// 情報を表示
		e1.showInfo();
		System.out.println("----------");
		e2.showInfo();
	}
}
