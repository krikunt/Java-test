import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;

public class LoginTestNew {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void checkLoginPage() {
        String title = driver.getTitle();
        org.testng.Assert.assertTrue(title.contains("Swag Labs"),
                "Назва сторінки не містить тексту 'Swag Labs'");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(loginPage.isUsernameVisible(), "Поле логіну не відображається");
        softAssert.assertTrue(loginPage.isPasswordVisible(), "Поле паролю не відображається");
        softAssert.assertTrue(loginPage.isLoginButtonVisible(), "Кнопка входу не відображається");

        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



