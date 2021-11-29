import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Ejercicio9Practico10 {

    @Test
    public void fullRegistrationTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.id("password_step_input")).sendKeys("“123456789”");

        WebElement elementMonth = driver.findElement(By.name("birthday_month"));
        Select selectMonth = new Select(elementMonth);
        selectMonth.selectByIndex(5);

        WebElement elementDays = driver.findElement(By.name("birthday_day"));
        Select selectDays = new Select(elementDays);
        selectDays.selectByVisibleText("26");

        WebElement elementYears = driver.findElement(By.name("birthday_year"));
        Select selectYear = new Select(elementYears);
        selectYear.selectByValue("1980");

        List<WebElement> listaGenero = driver.findElements(By.name("sex"));
        System.out.println("--> Se encontraron elementos: " + listaGenero.size());
        WebElement generoHombreRadioButton = listaGenero.get(1);
        generoHombreRadioButton.click();
    }

}
