import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ejercicio14 {

    @Test
    public void netflixTest(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com");
        driver.manage().window().maximize();

        //Mostrar los elementos h1 y h2 que hay en el sitio
        List<WebElement> elementsH1 = driver.findElements(By.tagName("h1"));
        for (WebElement listH1 : elementsH1) {
            System.out.println("Los elementos h1 son: " + listH1.getText());
        }

        List<WebElement> elementsH2 = driver.findElements(By.tagName("h1"));
        for (WebElement listH2 : elementsH2) {
            System.out.println("Los elementos h2 son: " + listH2.getText());
        }

        //Refrescar la página
        driver.navigate().refresh();

        //Mostrar el texto de los botones que se encuentran en la página
        List<WebElement> listButtons = driver.findElements(By.tagName("button"));
        for (WebElement textButtons : listButtons) {
            System.out.println("Los textos de botones de la pagina son: " + textButtons.getText());
        }

        //Mostrar la cantidad de elementos div que contiene el sitio
        List<WebElement> listDiv = driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de elementos div son: " + listDiv.size());

        //Obtener y mostrar el título de la página
        String title = driver.getTitle();
        System.out.println("El título de la página es: " + title);

        //Mostrar la cantidad de elementos de tipos link
        List<WebElement> elementLinks = driver.findElements(By.tagName("a"));
        System.out.println("La cantidad de elementos de tipo link son: " + elementLinks.size());
    }
}
