package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowserTest {

    static String browser = "chrome";
    static String baseurl = "https://www.wcht.org.uk/";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("CHROME")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FIREFOX")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.get(baseurl);
        driver.close();
        
    }
}
