public class FormPage{
    public static void submitForm (WebDriver driver){
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
    }
}