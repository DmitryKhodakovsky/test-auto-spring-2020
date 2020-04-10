package lesson_jdi.pages;

import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;

public class JdiHomePage extends WebPage {

    @Css(".benefit")
    private WebList benefits;

    public int getBenefitsCount() {
        return benefits.size();
    }
}
