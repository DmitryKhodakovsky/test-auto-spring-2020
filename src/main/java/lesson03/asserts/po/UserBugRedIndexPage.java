package lesson03.asserts.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class UserBugRedIndexPage {

    private WebDriver driver;

    @FindBy(xpath = "//a//span[text()='Войти']")
    private WebElement loginButton;

    @FindBy(css = ".dropdown-toggle")
    private WebElement userButton;

    public UserBugRedIndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public UserBugRedLoginPage clickLoginButton() {
        loginButton.click();
        return new UserBugRedLoginPage(driver);
    }

    public void usernameShouldBe(String expected) {
        assertThat(userButton.getText()).isEqualTo(expected);
    }
}
