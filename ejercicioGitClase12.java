package clase12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ejercicioGitClase12 {

    public WebDriver driver;
    public String SITE_URL = "https://login.salesforce.com/?locale=eu";

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(SITE_URL);
    }

    @Test (priority = 3)
    public void LoginFailureTest(){

        //Valido el logo
        WebElement actualLogo = driver.findElement(By.id("logo_wrapper"));
        System.out.println("El logo es --> " +actualLogo.getText());
        Assert.assertTrue(actualLogo.getText().contains("Salesforce"));

        driver.findElement(By.id("username")).sendKeys("test@test.com");
        driver.findElement(By.id("password")).sendKeys("123466");
        driver.findElement(By.id("Login")).click();

        WebElement errorLogin = driver.findElement(By.id("error"));
        System.out.println("El mensaje de error es el siguiente --->" +errorLogin.getText());
        Assert.assertEquals(errorLogin.getText(), "Your access to salesforce.com has been disabled by your system administrator. Please contact your Administrator for more information.");
    }

    @AfterMethod
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}
