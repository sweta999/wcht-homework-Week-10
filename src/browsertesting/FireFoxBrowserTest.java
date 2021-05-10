package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxBrowserTest {

    public static void main(String[] args){

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wcht.org.uk/");

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());

        boolean Verifytitle = title.equals("Watford Community Housing homepage | Watford Community Housing");
        boolean VerifytitleContains = title.contains("housing");
        System.out.println(Verifytitle);
        System.out.println(VerifytitleContains);

        driver.close();

    }
}
