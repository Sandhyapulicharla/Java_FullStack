package junitproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator=new Calculator();
	  @BeforeClass
	  public static void m3() {
		  System.out.println("Before all methods");
	  }
	  
	  @AfterClass
	  public static void m4() {
		  System.out.println("After all methods");
	  }
	  
	  @Before
	  public void m1() {
		  System.out.println("executes before each test case");
	  }
	  @After
	  public void m2() {
		  System.out.println("executes After each test case");
	  }
	@Test
	public void addTest() {
		int c=calculator.add(20, 10);
		assertEquals(30,c);
	}
	@Test
	public void subTest() {
		int r=calculator.sub(20, 10);
		assertEquals(10,r);
	}
	@Test
	public void mulTest() {
		int m=calculator.mul(2, 10);
		assertEquals(20,m);
	}
	@Test
	public void validateTest() {
		boolean t=calculator.validation("admin", "admin");
		assertEquals(true,t);
	}

}
