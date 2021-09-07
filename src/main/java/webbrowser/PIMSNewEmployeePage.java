package webbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class PIMSNewEmployeePage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Rezia Parvin/IdeaProjects/TestNGDemo/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://54.172.98.170:443/");

        System.out.println("Browser Opened");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        System.out.println("Page Title " + driver.getTitle());

        driver.findElement(By.id("exampleInputEmail")).sendKeys("admin");
        driver.findElement(By.id("exampleInputPassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("body > div > div > div > div > div > div > div > div > form > button")).click();

        WebElement pims= driver.findElement(By.id("Setting_PIMS"));
        //Select allEmp=new Select(pims);
        //allEmp.selectByVisibleText("");
        pims.click();
        Thread.sleep(3000);

        WebElement allEmployee= driver.findElement(By.xpath("//*[@id=\"collapse_PIMS\"]/a/span"));
        allEmployee.click();

        //WebElement search= driver.findElement(By.className("form-control form-control-sm"));
        //search.sendKeys("hossain");


        //WebElement newEmployee= driver.findElement(By.xpath("//*[@id=\"collapse_PIMS\"]/a/span"));
        //newEmployee.click();
        //Thread.sleep(3000);
        //WebElement empid= driver.findElement(By.id("employeeCode"));
        //empid.sendKeys("987654321");


        driver.close();

    }

}
