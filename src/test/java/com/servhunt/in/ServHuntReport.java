package com.servhunt.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ServHuntReport {
	public static void main(String[] args) {
		
		ExtentReports extent = new ExtentReports();
		
		ExtentSparkReporter spark = new ExtentSparkReporter("extent-report.html");
		extent.attachReporter(spark);
		
		System.getProperty("webdriver.gecko.driver", "G:\\eclipse workplace\\TKA_Task\\ServHunt.in\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://servhunt.in/login");
		
		//extent = new ExtentReports();
       // extent.attachReporter(spark);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Tester", "Vishal Machhare");
        
        ExtentTest test = extent.createTest("MyFirstTest", "First test description");

        // log(Status, details)
        test.log(Status.INFO, "pass");
         //test.addScreenCaptureFromPath("/screenshot.png");
        
        // calling flush writes everything to the log file
        extent.flush(); 
	}

}
