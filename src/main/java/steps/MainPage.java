package steps;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    @Step("Найти в поиске {searchText}")
    public void goSearch(String searchText) {
        $(By.id("text")).setValue(searchText);
        $(By.xpath("//button[text()='Найти']")).click();
    }
}

