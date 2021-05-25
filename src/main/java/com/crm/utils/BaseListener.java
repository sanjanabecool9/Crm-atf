package com.crm.utils;
import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.crm.config.BrowserDriver;

//it will capture all the actions of testNG
public class BaseListener extends TestListenerAdapter{

	 @Override
	 public void onTestStart(ITestResult itr){
		 log("Test started..........");
	 }
	 
	 public void onTestSkipped(ITestResult itr){
		 log("Test" +itr.getName() + "is skipped.......");
		 
	 }
	 
	 
	 public void onTestPassed(ITestResult itr){
		 log("Test" +itr.getName() + "is passed.......");
		 log(itr.getTestClass());
		 log("priority of the method is " +itr.getMethod().getPriority());


	 }
	 
	 @Override
	 public void onTestFailure(ITestResult itr){
		 log("Test" +itr.getName() + "is failed.......");
		 log("priority of the method is " +itr.getMethod().getPriority());
		BrowserDriver.takeScreenShot();
		 
	 }
	 
	 private void log(String methodName){
		 System.out.println("methodName");
	 }
	 
     private void log(IClass testClass){
    	 System.out.println("testClass");
     }
	
	 
	 
} 
