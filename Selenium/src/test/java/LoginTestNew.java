import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTestNew {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void checkLoginPage() {
        String title = driver.getTitle();
        org.testng.Assert.assertTrue(title.contains("Swag Labs"), "Назва сторінки не містить тексту 'Swag Labs'");

        SoftAssert softAssert = new SoftAssert();

        WebElement usernameField = driver.findElement(By.id("user-name"));
        softAssert.assertTrue(usernameField.isDisplayed(),"Поле логіну не відображається");

        WebElement passwordField = driver.findElement(By.id("password"));
        softAssert.assertTrue(passwordField.isDisplayed(), "Поле паролю не відображається");

        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



