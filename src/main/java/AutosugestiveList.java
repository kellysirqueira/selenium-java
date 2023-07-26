import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AutosugestiveList {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind"); //de India
        Thread.sleep(3000);
        List<WebElement> listaAutoSugestiva =  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); //definir uma variavel para essa lista de elementos

        for (WebElement option : listaAutoSugestiva) { //na listaAutoSugestiva, me de uma opção, essa opção é um WebElement

            if (option.getText().equalsIgnoreCase("India")) { //pegue a opção que tenha o texto India
                option.click(); //quando encontrar, clique
                break; //finalize o loop ao encontrar o elemento India na lista WebElement listaAutoSugestiva
            }

        }

        driver.quit();
    }
}
