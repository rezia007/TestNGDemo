import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsOnTestNG {
    WebDriver driver;
    @BeforeClass
    void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.orangehrm.com/");
    }

    @Test(priority = 1)
    void contactSales(){
       WebElement contactSales= driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[3]/li[1]/a"));
        Assert.assertTrue(contactSales.isEnabled());
    }
    @Test(priority =2)
    void homePageTitle(){
        String title=driver.getTitle();
        Assert.assertEquals("OrangeHRM HR Software | Free HR Software | HRMS | HRIS",title,"Title is matched");
    }
    @AfterClass
     void tearDown(){
        driver.quit();
    }
}
