package tokarenko.haulmont.tezis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import tokarenko.AbstractPage;
import static tokarenko.haulmont.tezis.data.Data.*;


public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@cuba-id='loginField']")
    protected WebElement userName;

    @FindBy(xpath = "//input[@cuba-id='passwordField']")
    protected WebElement userPass;

    @FindBy(xpath = "//div[@cuba-id='loginSubmitButton']")
    protected WebElement enterButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
//        waiting.until(ExpectedConditions.visibilityOf(enterButton));
        wait("button", enterButton);
    }

    public void login(String login, String pass) {
        fieldInsert(userName, login);
        fieldInsert(userPass, pass);
        enterButton.click();
//        waiting.until(ExpectedConditions.presenceOfElementLocated(By.xpath(TEZIS_BTN)));
        wait("div", TEZIS_BTN);
    }

}
