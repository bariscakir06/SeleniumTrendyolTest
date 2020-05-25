package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //*****Page Variable*****
    public String baseUrl = "https://www.trendyol.com";

    //*****Web Elements*****
    By signInButton = By.id("accountBtn");
    By acceptCookies = By.className("fancybox-close");
    By myAccountButton = By.id("accountBtn");
    By searchBoxBy = By.className("search-box");
    By searchBoxButtonBy = By.xpath("//*[@id=\"auto-complete-app\"]/div/div/i");
    By searchedWordBy = By.xpath("//*[@id=\"search-app\"]/div/div/div[2]/div[1]/div[1]/div/h1");

    //*****Page Method*****

    public HomePage goToTrendyol(){
        driver.get(baseUrl);
        return this;
    }

    public void goToLoginPage(){
        click(signInButton);
    }

    public void goToAccountPage(){
        click(myAccountButton);
    }

    public void acceptCookies(){
        click(acceptCookies);
    }

    public void searchText(){
        writeText(searchBoxBy,"telefon");
        enterKey(searchBoxBy);
    }

    public void verifySearch(String expectedText){
        assertEqual(searchedWordBy, expectedText);

    }

}
