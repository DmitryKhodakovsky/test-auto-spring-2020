package lesson03;


import lesson03.composite.po.YandexMainPage;
import lesson03.composite.po.YandexResultPage;
import org.testng.annotations.Test;

public class CompositeTest extends AbstractBaseTest {

    @Test
    public void yandexSearchTest() {
        driver.get("https://yandex.ru");
        YandexMainPage ymp = new YandexMainPage(driver);
        ymp.search("мотоцикл");
        YandexResultPage yrp = new YandexResultPage(driver);
        System.out.println(yrp.getFirstItemText());
    }

}
