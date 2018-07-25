package com.ab.TestNextGeneration.utils;

import org.testng.annotations.AfterSuite;

public class SendMailToManager {

	@AfterSuite
	public void sendingMailToManager() {
		System.out.println(" After Suite --- Informing manager about the result of test cases");
	}//sendingMailToManager
	
}//SendMailToManager
