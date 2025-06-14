package POM;

import org.openqa.selenium.By;
import org.testng.Reporter;
import Base.BaseClass;

public class ManageOrder extends BaseClass {

    // Locators
    private static final By orderMenuIcon = By.xpath("//*[@id='navbarNav']/ul/li[1]/a/i");
    private static final By tableNumber = By.xpath("/html/body/div/div[1]/div[4]/div/div[4]/div[1]/div[1]"); // More stable locator recommended
   private static final By closeTable=By.xpath("/html/body/div[2]/div/div[6]/button[1]");
    private static final By manageOrderButton = By.tagName("a");
    private static final By viewReportLink = By.xpath("//div[@class='view-report']//a");
    private static final By downloadReportLink = By.xpath("//div[@class='download-report']//a");

    // Clicks the Order Menu and selects a table
    public static void verifyOrder() {
        driver.findElement(orderMenuIcon).click();
        driver.findElement(tableNumber).click();
        driver.findElement(closeTable).click();
        Reporter.log("Verify the order giveny by customer",true);
        
    }

    // Manages an order: click manage, select table, close it
    public static void manageOrder() {
        driver.findElement(manageOrderButton).click();
        Reporter.log("Admin should check the order", true);
      
    }

    // Verifies view and download of report
    public static void verifyViewDetailsReport() {
        driver.findElement(viewReportLink).click();
        driver.navigate().refresh();
        Reporter.log("View report clicked and page refreshed", true);

        driver.findElement(downloadReportLink).click();
        Reporter.log("Report download triggered", true);

        driver.navigate().back();
    }
}
