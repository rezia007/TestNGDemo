import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setUp(String browser, String app) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(app);
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
