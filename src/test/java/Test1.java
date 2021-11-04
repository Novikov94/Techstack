import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test1 extends WebDriverSettings {


    @Test
    public void Registration() {
        driver.get(SITE_URL);
        WebElement createAccount = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/a"));
        Assertions.assertTrue(createAccount.isDisplayed());
        createAccount.click();
        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        Assertions.assertTrue(email.isDisplayed());
        email.sendKeys("annatkacheva3826@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        Assertions.assertTrue(password.isDisplayed());
        password.sendKeys("12345678");
        WebElement confirmPassword = driver.findElement(By.xpath("//*[@id='confirmPassword']"));
        Assertions.assertTrue(confirmPassword.isDisplayed());
        confirmPassword.sendKeys("12345678");
        WebElement signUp = driver.findElement(By.xpath("//*[@id='signup-form']/div[4]/button"));
        Assertions.assertTrue(signUp.isEnabled());
        signUp.click();
    }

    @Test
    public void Login() {
        driver.get(SITE_URL);
        WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[1]/a"));
        Assertions.assertTrue(login.isEnabled());
        login.click();
        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        Assertions.assertTrue(email.isEnabled());
        email.sendKeys("garyk1994@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        Assertions.assertTrue(password.isDisplayed());
        password.sendKeys("novikov1994kram");
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/div/button"));
        Assertions.assertTrue(loginButton.isEnabled());
        loginButton.click();

    }
}
