import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.spicejet.com");

        driver.findElement(By.cssSelector(".css-1dbjc4n[data-testid='home-page-travellers']")).click();
        for(int i = 1; i < 3; i++) {
            driver.findElement(By.cssSelector(".css-1dbjc4n[data-testid='Adult-testID-plus-one-cta']")).click();
        }

        driver.findElement(By.cssSelector(".css-1dbjc4n[data-testid='home-page-travellers-done-cta']")).click();
        driver.findElement(By.cssSelector(".css-1cwyjr8.r-homxoj.r-ubezar.r-10paoce.r-13qz1uu")).click();
        driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'JSA')]")).click();
        driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
