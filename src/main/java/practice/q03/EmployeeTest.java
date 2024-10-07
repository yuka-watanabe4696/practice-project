package practice.q03;

public class EmployeeTest {
	public static void main(String[] args) {
		// Employeeオブジェクトの作成（名前と年齢を指定）
		Employee employee = new Employee("山田", 20);

		// 自己紹介を表示
		employee.selfIntroduction();
	}
}
