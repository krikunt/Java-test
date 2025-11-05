import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
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

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        if (loginButton.isDisplayed()) {
            System.out.println("Кнопку Login знайдено");
        }

        WebElement swagLogo = driver.findElement(By.xpath("//div[@class='login_logo']"));
        if (swagLogo.isDisplayed()) {
            System.out.println("Заголовок Swag Labs знайдено");
        }

        WebElement usernameField = driver.findElement(By.xpath("//input[contains(@class,'form_input')]"));
        if (usernameField.isDisplayed()) {
            System.out.println("Кнопка Username знайдено");
        }

        WebElement swagLogoCss = driver.findElement(By.cssSelector(".login_logo"));
        if (swagLogoCss.isDisplayed()){
            System.out.println("Заголовок Swag Labs знайдено");
        }
    }

    @AfterMethod
    public void tearDown() {
    }
}
