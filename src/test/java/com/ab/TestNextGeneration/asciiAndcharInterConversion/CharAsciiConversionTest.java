package com.ab.TestNextGeneration.asciiAndcharInterConversion;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ab.TestNextGeneration.CharAsciiInterConversion;

@Listeners(com.ab.reportGeneration.MyAppReport.class)
public class CharAsciiConversionTest {

	public static Logger log =  Logger.getLogger(CharAsciiInterConversion.class);
	@DataProvider
	public Object[][] testData(){
		return new Object[][] {
			{ 'A',65},
			{ 'B',66},
			{ 'C',67},
			{ 'D',68},
			{ 'Z',90},
			{ 'a',97},
			{ 'b',98},
			{ 'c',99},
			{ 'd',100},
			{ 'z',122},
			{ '1',49},
			{ '9',57}
		};
	}//testData
	
	@Test(dataProvider="testData" , groups="char2ascii")
	public void charToAsciiTest(final char character,final int ascii) {
		int result = CharAsciiInterConversion.charToAscii(character);
		Assert.assertEquals(result, ascii);
		log.debug(result);
	}//charToAsciiTest
	
	@Test(dataProvider="testData" , groups="ascii2char")
	public void asciiToCharTest(final char character,final int ascii) {
		char result = CharAsciiInterConversion.asciiToChar(ascii);
		Assert.assertEquals(result, character);
	}//asciiToCharTest
	
	@Test(retryAnalyzer=com.ab.reportGeneration.Retry.class)
	public void simpleMethod() {
		System.out.println(" Inside simple method --  Just checking IRetryAnalyzer ");
	}//simpleMethod
	
	@Test(invocationCount=5 , successPercentage=30)
	public  void anotherSimpleMethod() {
		System.out.println(" Inside anotherSimple method --  Just checking invocation count and successPercentage");
	}//anotherSimpleMethod
	
	@Test
	public void m1() {
		System.out.println(" Inside m1 ");
		Assert.fail();
	}//m1
	
	@Test(dependsOnMethods="m1")
	public void m2() {
	  	System.out.println(" Inside m2");
	}//m2
	
	@BeforeClass
	public void seeHowBeforeClassWorksOfConversions() {
		System.out.println(" CharAsciiConversionTest --  Before Class");
	}//seeHowBeforeClassWorks()
	
	@AfterClass
	public void seeHowAfterClassWorksOfConversions() {
		System.out.println(" CharAsciiConversionTest --  After Class ");
	}//seeHowAfterClassWorks
	
	@BeforeMethod
	public void  seeHowBeforeMethodWorksOfConversions() {
		System.out.println(" CharAsciiConversionTest --  Before Method ");
	}//seeHowBeforeMethodWorksOfConversions
	
	@AfterMethod
	public void  seeHowAfterMethodWorksOfConversions() {
		System.out.println(" CharAsciiConversionTest --  After Method ");
	}//seeHowAfterMethodWorksOfConversions
	
	@BeforeTest
	public void  seeHowBeforeTestWorksOfConversions() {
		System.out.println(" CharAsciiConversionTest --  Before Test ");
	}//seeHowBeforeTestWorksOfConversions
	
	@AfterTest
	public void  seeHowAfterTestWorksOfConversions() {
		System.out.println(" CharAsciiConversionTest --  After Test ");
	}//seeHowAfterTestWorksOfConversions
	
}//CharAsciiConversionTest
