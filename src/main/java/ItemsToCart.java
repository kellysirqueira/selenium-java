import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;

public class ItemsToCart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web.chrome.driver", "./src/main/resources/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);

        int j = 0;
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formatedName = name[0].trim();
            List<String> itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formatedName)) {
                j++;
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

                if (j == 3) {
                    break;
                }
            }
        }

        driver.quit();
    }
}
