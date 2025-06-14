package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	protected static WebDriver driver;

	// ExtenReport
   public static ExtentReports extent = new ExtentReports();
	static ExtentSparkReporter spark = new ExtentSparkReporter("extent-report.html");
	ExtentTest test = extent.createTest("ServHuntTest", "Login");

	public static void openUrl() throws InterruptedException {

		extent.attachReporter(spark);

		extent.setSystemInfo("OS", System.getProperty("os.name"));
		extent.setSystemInfo("Browser", System.getProperty("br"
				+ "owser","firefox"));
		extent.setSystemInfo("Tester", "Vishal Machhare");

		String path = "G:\\eclipse workplace\\TKA_Task\\ServHunt.in\\Driver";
		System.getProperty("webdriver.gecko.driver", path + "\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.servhunt.in/");
		System.out.println("Open url");
		// Thread.sleep(3000);
	}

	public static void closeUrl() {
		driver.close();
		System.out.println("close url");
		extent.flush();
	}

}
