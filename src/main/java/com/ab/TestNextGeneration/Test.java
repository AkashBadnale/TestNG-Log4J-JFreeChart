package com.ab.TestNextGeneration;

import org.apache.log4j.Logger;

public class Test {

	public static Logger log = Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
	     
		int addResult1 = Calculator.addition(10, 15);
		log.info(addResult1);
		double  addResult2 = Calculator.addition(22, 22.35);
		log.info(addResult2);
		double addResult3 = Calculator.addition(15.17, 12);
		log.info(addResult3);
		double addResult4 = Calculator.addition(13.22, 15.22);
		log.info(addResult4);
		char charValue = CharAsciiInterConversion.asciiToChar(56);
		log.info(charValue);
		int intValue = CharAsciiInterConversion.charToAscii('X');
		log.info(intValue);
		
		/*try {
			//Runtime.getRuntime().exec("mvn clean test -Dgroups=char2ascii");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}//main
}//Test
