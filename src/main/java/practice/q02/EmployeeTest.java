package practice.q02;

public class EmployeeTest {
	public static void main(String[] args) {
		// Employeeオブジェクトの作成
		Employee employee = new Employee();

		// 名前と年齢の設定
		employee.setName("山田");
		employee.setAge(20);

		// 設定された名前と年齢を取得して表示
		System.out.println("氏名：" + employee.getName());
		System.out.println("年齢：" + employee.getAge());
	}
}
