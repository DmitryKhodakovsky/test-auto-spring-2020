package lesson05.steps;

import io.qameta.allure.Step;
import lesson03.voids.po.UserBugRedIndexPage;
import lesson03.voids.po.UserBugRedLoginPage;
import lesson05.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class UserBugRedSteps {

    private WebDriver driver;

    private UserBugRedIndexPage indexPage;
    private UserBugRedLoginPage loginPage;

    public UserBugRedSteps() {
        driver = WebDriverSingleton.INSTANCE.getDriver();
        indexPage = PageFactory.initElements(driver, UserBugRedIndexPage.class);
        loginPage = PageFactory.initElements(driver, UserBugRedLoginPage.class);
    }

    @Step("I open '{0}' URL")
    public void open(String url) {
        driver.get(url);
    }

    @Step("I login as '{0}")
    public void loginAs(String username, String password) {
        indexPage.clickLoginButton();
        loginPage.sendKeysToUsernameTextField(username);
        loginPage.sendKeysToPasswordTextField(password);
        loginPage.clickAuthorizationButton();
    }

    @Step("Username should be '{0}")
    public void usernameShouldBe(String expectedUsername) {
        assertEquals(indexPage.getUserButtonText(), expectedUsername);
    }

}
