import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSetup {

    private static WebDriver driver;

    public static void setDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu", "start-maximized", "--disable-extensions", "--no-sandbox", "--disable-dev-shm-usage");
        options.setBrowserVersion("126");
        driver = new ChromeDriver(options);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
    }

}
