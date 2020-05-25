package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    //*****Page Variable*****

    //*****Web Elements*****

    By expectedTextBy = By.className("page-title");

    //Page Method

    public void verifyLogin(String expectedText){

        assertEqual(expectedTextBy, expectedText);
    }

}
