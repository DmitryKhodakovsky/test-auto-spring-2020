package lesson05;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureScreenshotListener.class})
public class SimpleStepsTest extends AbstractBaseTest {

    @Test
    public void userBugRedLoginTest() {
        steps.open("http://users.bugred.ru/");
        steps.loginAs("test.user@email.com", "test");
        steps.usernameShouldBe("test user");
    }

    @Test
    public void userBugRedErrorLoginTest() {
        steps.open("http://users.bugred.ru/");
        steps.loginAs("test.user@email.com", "test1231");
        steps.usernameShouldBe("test user");
    }
}
