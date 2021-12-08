package clase11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SpotifyWithCssSelectorTest {
    public WebDriver getChromeDriver(String URL) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

    @Test
    public void spotifyByPlaceHolderTest() throws InterruptedException {
        WebDriver driver = getChromeDriver("https://www.spotify.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[href='https://www.spotify.com/uy/signup/']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[placeholder='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("[placeholder='Vuelve a introducir tu correo electrónico.'")).sendKeys("test@test.com");
        driver.findElement(By.cssSelector("[placeholder='Crea una contraseña.']")).sendKeys("testAutomation");
        driver.findElement(By.cssSelector("[placeholder='Introduce un nombre de perfil.']")).sendKeys("automation");
        driver.findElement(By.cssSelector("[placeholder='DD']")).sendKeys("03");

        WebElement monthElement = driver.findElement(By.cssSelector("[name='month']"));
        Select month = new Select(monthElement);
        month.selectByVisibleText("Enero");

        driver.findElement(By.cssSelector("[placeholder='AAAA']")).sendKeys("2021");

        //Me esta faltando la parte del combobox con cssSelector, no estoy encontrando de que manera seleccionarlo
        List<WebElement> sexElement = driver.findElements(By.cssSelector("[name='gender']"));
        System.out.println("--> Se encontraron elementos: " + sexElement.size());

        WebElement sexRadioButton = sexElement.get(1);
        sexRadioButton.click();

        Assert.assertFalse(sexElement.isEmpty(), "Error: la lista deberia contener elementos!!");
        Assert.assertEquals(sexElement.size(),3,"Error: la lista deberia tener 2 elementos");

        /*driver.findElement(By.cssSelector("[name='marketing']")).click();
        driver.findElement(By.cssSelector("[name='thirdParty']")).click();*/

    }
}
