package StepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class BaseTest{
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void beforeScenario(){
        String browser = System.getProperty("BROWSER");
        String OS=System.getProperty("os.name").toLowerCase();

        if(browser.equals("chrome") || browser.equals("")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("Initialising Chrome Driver");
        }
        if(browser.equals("headless")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
            System.out.println("Initialising Driver");
        }
        if(browser.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            FirefoxProfile profile = new FirefoxProfile();
            profile.setAcceptUntrustedCertificates(true);
            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(profile);
            driver = new FirefoxDriver(options);
            System.out.println("Initialising Firefox Driver");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 60, 60000);
    }

    @After
    public void afterScenario(Scenario scenario){
        System.out.println("This will run after the Scenario");
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        this.driver.quit();
    }
}