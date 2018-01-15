import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Product;

class ProductTest {
	Product test = new Product();
	@Test
	void testProductSearch() {
		assertEquals("Result",1,test.ProductSearch(1));
	}

	@Test
	void testProductUpd() {
		assertEquals("Result",1,test.ProductUpd(1,100));
	}

	@Test
	void testProductNew() {
		assertEquals("Result",0,test.ProductNew(1,"gaming pontiki",1000));
		assertEquals("Result",1,test.ProductNew(11,"gaming pontiki",1000));
	}

}
