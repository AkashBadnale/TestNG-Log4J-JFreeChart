package com.ab.TestNextGeneration.calculator;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ab.TestNextGeneration.Calculator;

@Listeners(com.ab.reportGeneration.MyAppReport.class)
public class CalculatorTest {

	@Test(dataProvider="addMethodDataProvider1" , dataProviderClass=CalculatorDataProvider.class, groups="addition")
	public void addMethodTest(double a , double b, double expectedValue) {
		  double result = Calculator.addition(a, b);
		  Assert.assertEquals(result, expectedValue);
	}//addMethodTest
	
	@Test(dataProvider="addMethodDataProvider2",dataProviderClass=CalculatorDataProvider.class, groups="addition")
	public void addMethodTest2(int a , int b, int expectedValue) {
		int result = Calculator.addition(a, b);
		Assert.assertEquals(result, expectedValue);
	}//addMethodTest2
	
	@Test(dataProvider="addMethodDataProvider3" ,dataProviderClass=CalculatorDataProvider.class , groups="addition" /*, enabled=false*/)
	public void addMethodTest3(int a, double b , double expectedValue) {
		double result = Calculator.addition(a, b);
		Assert.assertEquals(result, expectedValue);
	}//addMethodTest3
	
	@Test(dataProvider="addMethodDataProvider4",dataProviderClass=CalculatorDataProvider.class , groups="addition"/*, enabled=false*/)
	public void addMethodTest4(double a, int b , double expectedValue) {
		double result = Calculator.addition(a, b);
		Assert.assertEquals(result, expectedValue);
	}//addMethodTest4
	
	@Test(dataProvider="substractMethodDataProvider1" , dataProviderClass=CalculatorDataProvider.class , groups="substraction" , dependsOnMethods="addMethodTest3")
	public void substractMethodTest(double a,double b, double expectedValue) {
		double result = Calculator.substraction(a, b);
		Assert.assertEquals(result, expectedValue);
	}//substractMethodTest
	
	@Test(dataProvider="substractMethodDataProvider2" , dataProviderClass=CalculatorDataProvider.class , groups="substraction")
	public void substractMethodTest2(int a,int b, int expectedValue) {
		int result = Calculator.substraction(a, b);
		Assert.assertEquals(result, expectedValue);
	}//substractMethodTest2
	
	@Test(dataProvider="substractMethodDataProvider3" , dataProviderClass=CalculatorDataProvider.class , groups="substraction")
	public void substractMethodTest3(int a,double b, double expectedValue) {
		double result = Calculator.substraction(a, b);
		Assert.assertEquals(result, expectedValue);
	}//substractMethodTest3
	
	@Test(dataProvider="substractMethodDataProvider4" , dataProviderClass=CalculatorDataProvider.class , groups="substraction")
	public void substractMethodTest4(double a,int b, double expectedValue) {
		double result = Calculator.substraction(a, b);
		Assert.assertEquals(result, expectedValue);
	}//substractMethodTest4
	
	@Test(dataProvider="multiplyMethodDataProvider1",dataProviderClass=CalculatorDataProvider.class , groups="multiplication")
	public void multiplyMethodTest(double a, double b, double expectedValue) {
		 double result = Calculator.multiplication(a, b);
		 Assert.assertEquals(result, expectedValue);
	}//multiplyMethodTest
	
	@Test(dataProvider="divisionMethodDataProvider1" , dataProviderClass=CalculatorDataProvider.class , groups="division")
	public void divisionMethodTest(double a , double b , double expectedValue) {
		double result = Calculator.division(a, b);
		Assert.assertEquals(result, expectedValue);
	}//divisionMethodTest
	
	
	@BeforeClass
	public void seeHowBeforeClassWorksOfCalculator() {
		System.out.println(" CalculatorTest --  Before Class");
	}//seeHowBeforeClassWorks()
	
	@AfterClass
	public void seeHowAfterClassWorksOfCalculator() {
		System.out.println(" CalculatorTest --  After Class ");
	}//seeHowAfterClassWorks
	
	@BeforeMethod
	public void  seeHowBeforeMethodWorksOfCalculator() {
		System.out.println(" CalculatorTest --  Before Method ");
	}//seeHowBeforeMethodWorksOfConversions
	
	@BeforeMethod
	public void  seeHowAfterMethodWorksOfCalculator() {
		System.out.println(" CalculatorTest --  After Method ");
	}//seeHowAfterMethodWorksOfConversions
	
	@BeforeTest
	public void  seeHowBeforeTestWorksOfCalculator() {
		System.out.println(" CalculatorTest --  Before Test ");
	}//seeHowBeforeTestWorksOfConversions
	
	@AfterTest
	public void  seeHowAfterTestWorksOfCalculator() {
		System.out.println(" CalculatorTest --  After Test ");
	}//seeHowAfterTestWorksOfConversions
	
}//CalculatorTest
