package actions;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ClickWeb extends MainAction {
    @Step("Кликаем на элемент {text} с локатором {locator}")
    public void loc(String locator, String text) {
        $(By.xpath(String.format(locator, text))).waitUntil(Condition.exist, waitTime).click();
    }
}

