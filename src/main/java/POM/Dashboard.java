package POM;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentTest;

import Base.BaseClass;

public class Dashboard extends BaseClass {
	ExtentTest Test=extent.createTest("ServeHuntTest2","Dashboard");
	
	static By Logo=By.xpath("/html/body/nav/div/a");
	static By Accept_Order=By.id("sliderElement");
	static By Download_QR=By.xpath("/html/body/div[2]/div[2]/div[2]/div/a");

	public static void verifyDashboardEmelment()
	{
		
		driver.findElement(Logo).click();
		driver.findElement(Accept_Order).click();  
		//driver.findElement(Download_QR).click();  //Downloading QR code
		
		
	}
	
	
	

}
