package TestNgBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronogicalAnnotation {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("beforeSuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@Test
	public void testCase() {
		System.out.println("testCase");
	}
	@AfterMethod
	public void aftrerSuit() {
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void aftrerTest() {
		System.out.println("AfterClass");
	}
	@AfterTest
	public void aftrerClass() {
		System.out.println("AfterClass");
	}
	@AfterSuite
	public void aftrerSuite() {
		System.out.println("AfterSuite");
	}
}
