import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;


public class Locators {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);

//
//        String name = "Kelly";
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        String password = getPassword(driver);
//        driver.get("https://rahulshettyacademy.com/locatorspractice/");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        driver.findElement(By.id("inputUsername")).sendKeys(name); //TODO: RandomString package
//        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
//        driver.findElement(By.className("signInBtn")).click();
//        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//        driver.findElement(By.linkText("Forgot your password?")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
//        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kelly@rsa.com");
//        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("kelly@email.com");
//        driver.findElement(By.xpath("//form/input[3]")).sendKeys("121133214");
//        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//
//        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
//        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
//        driver.findElement(By.id("chkboxOne")).click();
//        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//        Thread.sleep(2000);
//        System.out.println(driver.findElement(By.tagName("p")).getText());
//        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//        System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
//        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
//        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
//
//        driver.manage().window().maximize();
//        driver.get("http://google.com");
//        driver.navigate().to("https://rahulshettyacademy.com");
//        driver.navigate().back();
//        driver.navigate().forward();
//
//
//
//        driver.get("http://www.spicejet.com");
//        driver.findElement(By.cssSelector(".css-1dbjc4n[data-testid='home-page-travellers']")).click();
//
////        int passenger = 1;
////        while(passenger<5){
////            driver.findElement(By.cssSelector(".css-1dbjc4n[data-testid='Adult-testID-plus-one-cta']")).click();
////            passenger++;
////        }
//
//        for(int i = 1; i < 3; i++) {
//            driver.findElement(By.cssSelector(".css-1dbjc4n[data-testid='Adult-testID-plus-one-cta']")).click();
//        }
//        driver.findElement(By.cssSelector(".css-1dbjc4n[data-testid='home-page-travellers-done-cta']")).click();
//        driver.findElement(By.cssSelector(".css-1cwyjr8.r-homxoj.r-ubezar.r-10paoce.r-13qz1uu")).click();
//        driver.findElement(By.xpath("//div[contains(text(),'MAA')]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[contains(text(),'JSA')]")).click();
//        driver.findElement(By.xpath("//div[data-testid='departure-date-dropdown-label-test-id']")).click();
//        Thread.sleep(2000);

        driver.get(" https://rahulshettyacademy.com/dropdownsPractise/");
//        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//        Select dropdown = new Select(staticDropdown);
//        dropdown.selectByIndex(3);
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.selectByVisibleText("AED");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.selectByValue("INR");
//        System.out.println(dropdown.getFirstSelectedOption().getText());

        //selenium run through the first option - the test will fail if I pass only a simple element, I need to specify
        //clearly the information
        // nao precisa clicar em um campo se ele ja abre automaticamente
        // colocar um Thread.sleep(2000); pra evitar de falhar
        // nao é a melhor pratica, ele vai falar em proximas aula
        //
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='MAA']")).click();



//        driver.quit();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        String[] passwordArray = passwordText.split("'");
        return passwordArray[1].split("'")[0];
    }
}

