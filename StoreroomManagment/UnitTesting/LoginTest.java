import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Login;

class LoginTest {
 private Login tester = new Login();
	
 @Test
	void testLoging() {
		tester.Loging(12,"123");
		assertEquals("admin",tester.ReturnRole());
		tester.Loging(1,"123");
		assertEquals("sales",tester.ReturnRole());	
		tester.Loging(0,"123");
		assertEquals("no",tester.ReturnRole());	
	}


}
