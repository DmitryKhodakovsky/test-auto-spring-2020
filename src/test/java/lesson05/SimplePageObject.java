package lesson05;

import lesson03.voids.po.UserBugRedIndexPage;
import lesson03.voids.po.UserBugRedLoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SimplePageObject extends AbstractBaseTest {

    @Test
    public void userBugRedLoginTest() {
        driver.get("http://users.bugred.ru/");

        UserBugRedIndexPage indexPage = PageFactory.initElements(driver, UserBugRedIndexPage.class);
        indexPage.clickLoginButton();

        UserBugRedLoginPage loginPage = PageFactory.initElements(driver, UserBugRedLoginPage.class);
        loginPage.login("test.user@email.com", "test");

        assertEquals(indexPage.getUserButtonText(), "test user");
    }

    @Test
    public void userBugRedErrorLoginTest() {
        driver.get("http://users.bugred.ru/");

        UserBugRedIndexPage indexPage = PageFactory.initElements(driver, UserBugRedIndexPage.class);
        indexPage.clickLoginButton();

        UserBugRedLoginPage loginPage = PageFactory.initElements(driver, UserBugRedLoginPage.class);
        loginPage.login("test.user@email.com", "test212");

        assertEquals(loginPage.getUsernameTextFieldValue(), "");
    }
}
