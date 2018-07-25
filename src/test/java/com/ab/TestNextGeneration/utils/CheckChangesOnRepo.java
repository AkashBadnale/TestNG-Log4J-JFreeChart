package com.ab.TestNextGeneration.utils;

import org.testng.annotations.BeforeSuite;

public class CheckChangesOnRepo {

	@BeforeSuite
	public void checkIfYouHaveUpdatedYourProject() {
		System.out.println("Before Suite ---  Checking that if there are any changes made on repository . And if there are changes then update your project first");
	}//checkIfYouHaveUpdatedYourProject
	
}//CheckChangesOnRepo
