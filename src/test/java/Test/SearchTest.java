package Test;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LoginPage;
import org.junit.Test;

public class SearchTest extends BaseTest {

    String username = "cakirbaris06@gmail.com";
    String password = "199583424724";
    String expectedText = "telefon";

    @Test
    public void searchTestLogin(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.goToTrendyol();
        homePage.acceptCookies();
        homePage.goToLoginPage();
        loginPage.loginToTrendyol(username,password);
        homePage.goToTrendyol();
        homePage.searchText();
        homePage.verifySearch(expectedText);

    }

    @Test
    public void searchTestNotLogin(){

        HomePage homePage = new HomePage(driver);

        homePage.goToTrendyol();
        homePage.acceptCookies();
        homePage.searchText();
        homePage.verifySearch(expectedText);

    }

}
