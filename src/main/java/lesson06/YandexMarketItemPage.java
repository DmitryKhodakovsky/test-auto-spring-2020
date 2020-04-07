package lesson06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexMarketItemPage extends AbstractPage {

    @FindBy(css = "div.n-product-price-cpa2__price>span.price")
    private WebElement priceLabel;

    public YandexMarketItemPage(WebDriver driver) {
        super(driver);
    }

    public String getItemPrice() {
        return priceLabel.getText();
    }
}
