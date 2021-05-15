import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Carol/Downloads/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Maria");

        driver.findElement(By.id("last-name")).sendKeys("Santos");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("05/28/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        WebDriverWait wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn.btn-lg.btn-primary"))).click();

        WebElement alert =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

        String alertText= alert.getText();

        assertEquals("The for")



        driver.quit();
    }
}
