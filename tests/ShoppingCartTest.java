import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {
	// 1. make 1 function per test case
	// 2. put the @Test decorator on 
	// 		top of the test case
	// 3. write code for your test case
	// 4. call assertEquals() in 
	// 		your test case
	// 5. Run the program
	// 6. look at results!
	@Test
	public void testCreateCart() {
		// Test: When created, the cart has 0 items 

		// 1. Make a new cart
		ShoppingCart cart = new ShoppingCart();
		
		// 2. check number of itmes in cart
		int a = cart.getItemCount();
		
		// 3. do the assert
		assertEquals(0, a);
	}
	
	@Test
	public void testEmptyTheCart() {
		// 1.Create a new cart
		ShoppingCart cart = new ShoppingCart();
		// 2. Add an item to the cart
		Product phone = new Product("iphone", 1500);
		Product hamburger = new Product("burger", 10);
		cart.addItem(phone);
		cart.addItem(hamburger);
		
		// 3.Get rid of all items in the cart
		cart.empty();
		
		// 4. Check num items in cart === E = 0
		assertEquals(0, cart.getItemCount());
	}
	

	
}
