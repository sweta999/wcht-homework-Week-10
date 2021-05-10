package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IEBrowserTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.wcht.org.uk/");

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(title.length());

        boolean Verifytitle = title.equals("Watford Community Housing homepage | Watford Community Housing");
        boolean VerifytitleContains = title.contains("Community");
        System.out.println(Verifytitle);
        System.out.println(VerifytitleContains);

        driver.close();


    }
}
