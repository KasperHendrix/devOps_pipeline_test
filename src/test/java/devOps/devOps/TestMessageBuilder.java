package devOps.devOps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMessageBuilder {

	@Test
    public void testName() {
		App gm = new App(); 
		assertEquals("Hello Pasq",  gm.getMessage("pasq"));
	}
	
}
