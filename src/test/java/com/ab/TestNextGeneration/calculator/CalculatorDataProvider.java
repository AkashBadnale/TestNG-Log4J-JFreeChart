package com.ab.TestNextGeneration.calculator;

import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {

	@DataProvider(name="addMethodDataProvider1")
	public static Object[][]  addMethodDataProvider1(){
		return new Object[][] {
			{2.2,2.2,4.4}
		};
	}//addMethodDataProvider1
	
	@DataProvider(name="addMethodDataProvider2")
	public static Object[][]  addMethodDataProvider2(){
		return new Object[][] {
			{15,15,30}
		};
	}//addMethodDataProvider2
	
	@DataProvider(name="addMethodDataProvider3")
	public static Object[][]  addMethodDataProvider3(){
		return new Object[][] {
			{15,20.5,35.5}
		};
	}//addMethodDataProvider3
	
	@DataProvider(name="addMethodDataProvider4")
	public static Object[][]  addMethodDataProvider4(){
		return new Object[][] {
			{40.2,15,55.2}
		};
	}//addMethodDataProvider4
	
	@DataProvider(name="substractMethodDataProvider1")
	public static Object[][] substractMethodDataProvider1(){
		return new Object[][] {
			{2.2,2.2,0}
		};
	}//substractMethodDataProvider1
	
	@DataProvider(name="substractMethodDataProvider2")
	public static Object[][] substractMethodDataProvider2(){
		return new Object[][] {
			{8,6,2}
		};
	}//substractMethodDataProvider2
	
	@DataProvider(name="substractMethodDataProvider3")
	public static Object[][] substractMethodDataProvider3(){
		return new Object[][] {
			{8,6.2,1.7999999999999998}
		};
	}//substractMethodDataProvider3
	
	@DataProvider(name="substractMethodDataProvider4")
	public static Object[][] substractMethodDataProvider4(){
		return new Object[][] {
			{8.2,6,2.1999999999999993}
		};
	}//substractMethodDataProvider4
	
	@DataProvider(name="multiplyMethodDataProvider1")
	public static Object[][] multiplyMethodDataProvider1() {
		return new Object[][] {
			{8,5,40},
			{2,1.5,3},
			{2.1,1,2.1},
			{2.2,2.2,4.840000000000001}
		};
	}//multiplyMethodDataProvider1
	
	@DataProvider(name="divisionMethodDataProvider1")
	public static Object[][] divisionMethodDataProvider1() {
		return new Object[][] {
			{8,4,2},
			{1.4,7,0.19999999999999998},
			{4,0.5,8},
			{2.2,2.2,1}
		};
	}//divisionMethodDataProvider1
	
}//CalculatorDataProvider
