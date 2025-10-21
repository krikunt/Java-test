import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openSauceDemo() {
        driver.get("https://www.saucedemo.com/");
        String pageTitle = driver.getTitle();

        if (pageTitle.contains("Swag Labs")) {
            System.out.println("Перевірку пройдено: заголовок містить \"Swag Labs\"");
        } else {
            System.out.println("Перевірку не пройдено: заголовок не містить \"Swag Labs\"");
        }
    }

    @AfterClass
    public void tearDown() {
    }
}
