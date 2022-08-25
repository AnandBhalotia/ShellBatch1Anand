package com.test.anand;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//import com.test.shelljunitpractice.calculator;

public class testGrade {
	
	Marks mark;
	
	@Before
	public void thisIsBeforeAnnotation() {
		mark = new Marks();
	}

	@Test
	public void validateFail() {
		String expectedResult = "Fail";
		String actualResult = mark.grade(30);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void validate1st() {
		String expectedResult = "1st Class";
		String actualResult = mark.grade(76);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void validate2nd() {
		String expectedResult = "2nd Class";
		String actualResult = mark.grade(56);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void validate3rd() {
		String expectedResult = "3rd Class";
		String actualResult = mark.grade(46);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@After
	public void tearDown() {
		System.out.println("Testcase is Completed");
	}

}
