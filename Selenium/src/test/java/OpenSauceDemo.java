import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSauceDemo {
    public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();

      driver.get("https://www.saucedemo.com/");

      driver.manage().window().maximize();
    }
}
