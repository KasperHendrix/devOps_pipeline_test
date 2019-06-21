package devOps.devOps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMessageBuilder {

	@Test
    public void testName() {
		App app = new App(); 
		assertEquals("Hello Pasq",  app.getMessage("Pasq"));
	}
	
	@Test
	public void testNameEmpty() {
		App app1 = new App();
		assertEquals("Please provide a name!", app1.getMessage(" "));
	}
	
	@Test
	public void testNameNull() {
		App app2 = new App();
		assertEquals("Please provide a name!", app2.getMessage(null));
	}
	
//	@Test
//	public void testNameWithNumbers() {
//		App app2 = new App();
//		assertEquals("Please provide a name!", app2.getMessage("p4sq"));
//	}
	
	
}
