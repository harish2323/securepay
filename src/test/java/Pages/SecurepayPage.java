package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SecurepayPage {
    WebDriver driver;

    public SecurepayPage(WebDriver driver) {
       PageFactory.initElements(driver, this);
       this.driver = driver;
    }

    @FindBy(how = How.LINK_TEXT, using="Contact Us")
    public static WebElement CONTACT_US_LINK;

}