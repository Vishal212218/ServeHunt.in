package POM;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import Base.BaseClass;

public class LoginPage extends BaseClass{
	static By Email=By.id("email"); 
	static By Password=By.id("password"); 
	static By Remember=By.id("remember"); 
	static By Login_btn=By.id("loginButton"); 
	static By Logout=By.xpath("//*[@id=\"navbarNav\"]/ul/li[4]/a");
	public static void verifyLogin(String url) throws InterruptedException
	{
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(Email).sendKeys("Kanishk@gmail.com");
		driver.findElement(Password).sendKeys("Kanishk@1234");
		driver.findElement(Remember).click();
		Thread.sleep(3000);
		driver.findElement(Login_btn).click();
		System.out.println("Login Successfully...!");
		 LocalDateTime now = LocalDateTime.now();
	        System.out.println("Now: " + now);
	}
	public static void VerifyLogout()
	{
		driver.findElement(Logout).click();
		System.out.println("Logout the application");
		}

}
