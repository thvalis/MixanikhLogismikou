import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Product;

class ProductTest {
	Product test = new Product();
	@Test
	void testProductSearch() {
		assertEquals("Result",1,test.productSearch(1));
	}

	@Test
	void testProductUpd() {
		assertEquals("Result",1,test.productUpd(1,100));
	}

	@Test
	void testProductNew() {
		assertEquals("Result",0,test.productNew(1,"gaming pontiki",1000));
		assertEquals("Result",1,test.productNew(11,"gaming pontiki",1000));
	}

}
