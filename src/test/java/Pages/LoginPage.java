package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //*****Web Elements*****
    By userNameBy = By.id("email");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("loginSubmit");
    By errorLoginMessageBy = By.id("errorBox");

    public void loginToTrendyol(String username, String password){
        writeText(userNameBy, username);
        writeText(passwordBy, password);
        click(loginButtonBy);
    }

    public LoginPage verifyLoginUserName(String expectedText){
        assertEqual(errorLoginMessageBy, expectedText);
        return this;
    }

    public LoginPage verifyLoginPassword(String expectedText){
        assertEqual(errorLoginMessageBy, expectedText);
        return this;
    }

}
