package Test;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.After;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setUp(){

        //Create a set property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");

        driver = new ChromeDriver();

        //Create a maximize window
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
       driver.quit();
    }


}
