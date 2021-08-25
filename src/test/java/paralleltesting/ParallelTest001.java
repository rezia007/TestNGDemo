package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest001 {
    WebDriver driver;

    @Test
    void loginTest() throws InterruptedException{
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.orangehrm.com/");
    WebElement contactSales= driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[3]/li[1]/a"));
    Assert.assertTrue(contactSales.isEnabled());
    Thread.sleep(5000);
    }

    @Test
    void homePageTitle() throws InterruptedException{
        String title=driver.getTitle();
        Assert.assertEquals("OrangeHRM HR Software | Free HR Software | HRMS | HRIS",title,"Title is matched");
        Thread.sleep(5000);
    }
    @AfterMethod
    void tearDown()
    {
        driver.quit();
    }
}

