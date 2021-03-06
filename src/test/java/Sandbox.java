import haulmont.appmanager.pages.Login;

import haulmont.appmanager.pages.Main;
import haulmont.appmanager.pages.selenide.SelLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static tokarenko.haulmont.tezis.data.Data.TEZIS_BTN;
import static tokarenko.haulmont.tezis.data.Data.URL;
import static utils.Utils.sleep;

public class Sandbox {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get(URL);
            driver.manage().window().maximize();
            SelLogin login = new SelLogin(driver);
            login.loginField.click();
            login.loginField.sendKeys("login");
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            driver.quit();
        }
    }

}