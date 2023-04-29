// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ariefch\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.printf("Hello and welcome!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        WebElement textBox = driver.findElement(By.className("gLFyf"));
        textBox.sendKeys("Selenium");
        textBox.sendKeys(Keys.ENTER);

    }
}