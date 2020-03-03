package Pages;


import StepDefinition.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class GooglePage {
    WebDriver driver;
    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(how = How.ID_OR_NAME, using = "q")
    public static WebElement GOOGLE_SEARCH_TEXT_BOX;

    @FindBy(how = How.XPATH, using = "//*[@name='btnK'][1]")
    public static WebElement GOOGLE_SEARCH_BUTTON;

    public static WebElement SECUREPAY_LINK(String securepay_link)
    {
        return(BaseTest.driver.findElement(By.xpath("//a[@href='"+securepay_link+"']")));
    }

}
