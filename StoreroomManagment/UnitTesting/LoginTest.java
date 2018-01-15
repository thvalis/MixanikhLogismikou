import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Login;

class LoginTest {
 private Login tester = new Login();
	
 @Test
	void testLoging() {
		tester.loging(12,"123");
		assertEquals("admin",tester.returnRole());
		tester.loging(1,"123");
		assertEquals("sales",tester.returnRole());	
		tester.loging(0,"123");
		assertEquals("no",tester.returnRole());	
	}


}
