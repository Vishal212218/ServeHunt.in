package POM;

import org.openqa.selenium.By;
import Base.BaseClass;

public class RegisterUser extends BaseClass{
	//static WebDriver driver;
	
	static By register_btn=By.xpath("//*[@id=\"navbarNav\"]/ul/li[7]/a"); 
	static By Hotel_name=By.id("hotel_name");
	static By Hotel_Type=By.id("hotel_type");
	static By Hotel_type_name=By.xpath("//*//*[@id=\"hotel_type\"]/option[2]");
	static By Mobile_no=By.id("phone");
	static By Email=By.id("email"); 
	static By address=By.id("address"); 
	static By Table_No=By.id("no_of_tables"); 
	static By Pincode_No=By.id("pincode"); 
	static By City=By.id("city"); 
	static By State=By.id("state"); 
	static By Country=By.id("country"); 
	static By Owner_Name=By.id("owner_name"); 
	static By Owner_Phone=By.id("owner_phone"); 
	static By Password=By.id("password"); 
	static By Confirm_Password=By.id("confirm_password"); 
	static By Checkbox=By.id("termsCheck"); 
	static By Submit_btn=By.id("registerBtn"); 
	
	
	
	public static void registerUser() throws InterruptedException
	{
		driver.findElement(register_btn).click();
		System.out.println("Click on register button");
		Thread.sleep(3000);
		driver.findElement(Hotel_name).sendKeys("Kanshik Resto and Bar");
		driver.findElement(Hotel_Type).click();
		driver.findElement(Hotel_type_name).click();
		driver.findElement(Mobile_no).sendKeys("9922455174");
		driver.findElement(Email).sendKeys("Kanishk@gmail.com");
		driver.findElement(address).sendKeys("Karve Nagare,Pune 411058");
		driver.findElement(Table_No).sendKeys("5");
		driver.findElement(Pincode_No).sendKeys("411058");
		Thread.sleep(3000);
		/*
		 * driver.findElement(City).sendKeys("Pune");
		 * driver.findElement(State).sendKeys("Maharashtra");
		 * driver.findElement(Country).sendKeys("India");
		 */
		driver.findElement(Owner_Name).sendKeys("Aditya_Chavhan");
		driver.findElement(Owner_Phone).sendKeys("9922455174");
		driver.findElement(Password).sendKeys("Kanishk@1234");
		Thread.sleep(3000);
		driver.findElement(Confirm_Password).sendKeys("Kanishk@1234");
		driver.findElement(Checkbox).click();
		Thread.sleep(2000);
		driver.findElement(Submit_btn).click();
		System.out.println("Registration Successful...!");
		Thread.sleep(5000);
	}

}
