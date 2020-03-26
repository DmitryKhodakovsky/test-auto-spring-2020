package lesson03;

import lesson03.asserts.po.UserBugRedIndexPage;
import org.testng.annotations.Test;

public class AssertsPageObjectTest extends AbstractBaseTest {

    @Test
    public void userBugRedLoginTest() {
        driver.get("http://users.bugred.ru/");

        new UserBugRedIndexPage(driver)
                .clickLoginButton()
                .login("test.user@email.com", "test")
                .usernameShouldBe("test user");
    }

}
