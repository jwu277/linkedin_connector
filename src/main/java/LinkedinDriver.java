import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedinDriver {

    private WebDriver driver = new FirefoxDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 30);

    public void quit() {
        driver.quit();
    }

    public void login(String user, String pw) {
        driver.get("https://linkedin.com/login");
        driver.findElement(By.id("username")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pw);
        driver.findElement(By.tagName("button")).click();
    }

    public void addConnection(String connectionUrl) {

        driver.get(connectionUrl);

        WebElement button = driver.findElement(By.id("ember55"));
        if (button.getAttribute("aria-label").startsWith("Connect")) {

            button.click();

            WebElement button2 = driver.findElement(By.id("ember470"));

            wait.until(ExpectedConditions.elementToBeClickable(button2));
            button2.click();

        }

    }

}
