package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage{
    WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using="//h1[text()='Contact us']")
    public static WebElement CONTACT_US_HEADING;

    @FindBy(how = How.NAME, using="first-name")
    public static WebElement FIRST_NAME;

    @FindBy(how = How.NAME, using="last-name")
    public static WebElement LAST_NAME;

    @FindBy(how = How.NAME, using="email-address")
    public static WebElement EMAIL_ADDRESS;

    @FindBy(how = How.NAME, using="phone-number")
    public static WebElement PHONE_NUMBER;

    @FindBy(how = How.NAME, using="website-url")
    public static WebElement WEBSITE_URL;

    @FindBy(how = How.NAME, using="business-name")
    public static WebElement COMPANY;

    @FindBy(how = How.NAME, using="reason-for-enquiry")
    public static WebElement REASON;

    @FindBy(how = How.NAME, using="message")
    public static WebElement MESSAGE;
}