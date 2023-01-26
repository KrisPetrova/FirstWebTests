package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractSushiPage {
    public WebDriver driver;

    public AbstractSushiPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver(){
        return this.driver;
    }
}
