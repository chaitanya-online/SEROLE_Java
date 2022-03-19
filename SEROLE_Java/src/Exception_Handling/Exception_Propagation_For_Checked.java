package Exception_Handling;

import java.sql.SQLException;

public class Exception_Propagation_For_Checked {

	void method1() throws SQLException {
		throw new SQLException("Wrong syntax");
	}

	void method2() throws SQLException {
		method1();
	}

	void method3() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Exception_Propagation_For_Checked obj = new Exception_Propagation_For_Checked();
		obj.method3();
	}
}
