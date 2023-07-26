import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class StaticDropdown {
    public static <driver> void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);

//        driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");
//        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//
//        Select dropdown = new Select(staticDropdown);
//        dropdown.selectByIndex(3);
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.selectByVisibleText("AED");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.selectByValue("INR");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        Thread.sleep(5000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.spicejet.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.cssSelector(".css-1dbjc4n[data-testid='home-page-travellers']")).click();
//        int passenger = 1;
//        while(passenger<5){
//            driver.findElement(By.cssSelector(".css-1dbjc4n[data-testid='Adult-testID-plus-one-cta']")).click();
//            passenger++;
//        }

        for(int i = 1; i < 5; i++) {
            driver.findElement(By.cssSelector(".css-1dbjc4n[data-testid='Adult-testID-plus-one-cta']")).click();
        }
        driver.findElement(By.cssSelector(".css-1dbjc4n[data-testid='home-page-travellers-done-cta']")).click();


        driver.findElement(By.cssSelector(".css-1cwyjr8.r-homxoj.r-ubezar.r-10paoce.r-13qz1uu")).click();
        driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'JSA')]")).click();
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73'][1]")).click();
        driver.findElement(By.xpath("//div[data-testid='departure-date-dropdown-label-test-id']")).click();
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c'][1]")).click();

//        driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-day-16']")).click();

//        driver.findElement(By.xpath("//div[data-testid='return-date-dropdown-label-test-id']")).click();

//        Thread.sleep(10000);

//        driver.findElement(By.xpath("//div[data-testid='Adult-testID-plus-one-cta']")).click();
//        driver.findElement(By.xpath("//div[@class='css-1dbjc4n']")).click();



    }
}
