import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CompleteFlow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
        driver.findElement(By.cssSelector("input[value='OneWay']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("its disabled");
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }

        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.quit();
    }
}
