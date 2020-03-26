package lesson03;

import lesson03.fluent.po.UserBugRedIndexPage;
import lesson03.fluent.po.UserBugRedLoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FluentPageObjectTest extends AbstractBaseTest {

    @Test
    public void userBugRedLoginTest() {
        driver.get("http://users.bugred.ru/");

        String actualUserButtonText = new UserBugRedIndexPage(driver)
                .clickLoginButton()
                .login("test.user@email.com", "test")
                .getUserButtonText();

        assertEquals(actualUserButtonText, "test user");
    }

    @Test
    public void userBugRedLoginTest1() {
        driver.get("http://users.bugred.ru/");

        UserBugRedLoginPage loginPage = new UserBugRedIndexPage(driver).clickLoginButton();

        UserBugRedIndexPage indexPage = loginPage.login("test.user@email.com", "test");

        String actualUserButtonText = indexPage.getUserButtonText();

        assertEquals(actualUserButtonText, "test user");
    }

    @Test
    public void userBugRedLoginErrorTest() {
        driver.get("http://users.bugred.ru/");

        String actualUsernameTextFieldValue = new UserBugRedIndexPage(driver)
                .clickLoginButton()
                .loginError("test.user@email.com", "test121")
                .getUsernameTextFieldValue();

        assertEquals(actualUsernameTextFieldValue, "");
    }

}
