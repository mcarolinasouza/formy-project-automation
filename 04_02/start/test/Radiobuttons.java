import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/mariade/Downloads/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

       // Radio(driver);
      //  Check(driver);
       // DatePicker(driver);
       // DropDownMenu(driver);
        FileUpload(driver);
        driver.quit();

    }
    static void Radio(WebDriver driver) throws InterruptedException {

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        Thread.sleep(1000);

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2'"));
        radioButton2.click();

        Thread.sleep(1000);

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();

        Thread.sleep(1000);


}

    static void Check(WebDriver driver) throws InterruptedException {

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkBoxButton1 = driver.findElement(By.id("checkbox-1"));
        checkBoxButton1.click();

        Thread.sleep(1000);

        WebElement checkBoxButton2 = driver.findElement(By.cssSelector("input[value='checkbox-2'"));
        checkBoxButton2.click();

        Thread.sleep(1000);

        WebElement checkBoxButton3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        checkBoxButton3.click();

        Thread.sleep(1000);

    }

    static void DatePicker(WebDriver driver) throws InterruptedException {

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/03/2022");
        dateField.sendKeys(Keys.RETURN); //Enter

        Thread.sleep(1000);


    }


    static void DropDownMenu(WebDriver driver) throws InterruptedException {

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();

        //When locator is ID:
        //   WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        // autocompleteItem.click();

        //When locator is tag & attribute:
        //a tag is hidden. Remember Selenium is not able to interact with hidden element. Javascript is the only option in that case.
        WebElement element = driver.findElement(By.cssSelector("a[href='/dragdrop']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element);



        Thread.sleep(1000);

    }

    static void FileUpload(WebDriver driver) throws InterruptedException {

        driver.get("https://formy-project.herokuapp.com/fileupload");

       // WebElement chooseButton = driver.findElement(By.cssSelector("button.btn.btn-secondary.btn-choose"));
       // chooseButton.click();

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("820213923239161.pdf");
        Thread.sleep(1500);

    }



}