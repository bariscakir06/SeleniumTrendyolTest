package Test;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.junit.Test;


public class LoginTest extends BaseTest {



    String username = "cakirbaris06@gmail.com";
    String password = "199583424724";
    String wrongUserName = "bariscakir@gmail.com";
    String wrongPassword = "123456789";
    String expectedTextLogin = "Hesabım";
    String wrongLoginMessage = "Hatalı E-Posta / Şifre. Tekrar Deneyin.";

    @Test
    public void invalidLoginToTest_InvalidUserName(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.goToTrendyol();
        homePage.acceptCookies();
        homePage.goToLoginPage();
        loginPage.loginToTrendyol(wrongUserName, password);
        loginPage.verifyLoginUserName(wrongLoginMessage);
    }

    @Test
    public void invalidLoginToTest_InvalidPassword(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.goToTrendyol();
        homePage.acceptCookies();
        homePage.goToLoginPage();
        loginPage.loginToTrendyol(username, wrongPassword);
        loginPage.verifyLoginPassword(wrongLoginMessage);

    }

    @Test
    public void correctLoginTest(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        homePage.goToTrendyol();
        homePage.acceptCookies();
        homePage.goToLoginPage();
        loginPage.loginToTrendyol(username,password);
        homePage.goToTrendyol();
        homePage.goToAccountPage();
        accountPage.verifyLogin(expectedTextLogin);

    }

}

