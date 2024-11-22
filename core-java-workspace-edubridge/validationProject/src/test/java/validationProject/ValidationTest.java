package validationProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidationTest {
	Validation v=new Validation();
	@Test
	public void ValidationTest() {
		String r=v.validation("Admin", "Admin");
		assertEquals("success",r);
	}

}
