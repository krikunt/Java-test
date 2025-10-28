import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void openSauceDemo() {
        String pageTitle = driver.getTitle();

        if (pageTitle.contains("Swag Labs")) {
            System.out.println("Перевірку пройдено: заголовок містить \"Swag Labs\"");
        } else {
            System.out.println("Перевірку не пройдено: заголовок не містить \"Swag Labs\"");
        }
    }

    @Test
    public void checkElementsPresence() {

        if (!driver.findElements(By.id("login-button")).isEmpty()) {
            System.out.println("Кнопку Login знайдено");
        }

        if (!driver.findElements(By.className("login_logo")).isEmpty()) {
            System.out.println("Заголовок Swag Labs знайдено");
        }

        if (!driver.findElements(By.xpath("//input[contains(@class, 'form_input')]")).isEmpty()) {
            System.out.println("Кнопка Username знайдено");
        }

        if (!driver.findElements(By.cssSelector(".login_logo")).isEmpty()){
            System.out.println("Pаголовок Swag Labs знайдено");
        }
    }

    @AfterClass
    public void tearDown() {
    }
}
