package com.test.shelljunitpractice;

//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;

public class calcculatorTest {
	
	calculator calc;

	//this gets executed before each method/test case
	@Before
	public void thisIsBeforeAnnotation() {
		calc = new calculator();
	}
	
	//This is addition test case
	@Test
	public void validateAddition() {
		int expectedResult = 30;
		int actualResult = calc.addition(10, 20);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	//This is subtraction test case
	@Ignore
	@Test
	public void validateSubtraction() {
		int expectedResult = 50;
		int actualResult = calc.subtraction(10, 5);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	//This is new code after cloning and checking out
	@Test
	public void anotherMethod() {
		int expectedResult = 5;
		int actualResult = calc.subtraction(10, 5);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@After
	public void tearDown() {
		System.out.println("Testcase is Completed");
	}

}
