package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import fixture.Fixture;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

@Epic("Яндекс новости")
@Feature("Главная страница новостей")
@Story("Отображение блока новостей")
public class Tests_3_news extends Fixture {
    @Test(description = "Переход на вкладку новостей в Яндексе и поиск новостей")
    public void happyPassNews(){
        newsPage.openNewsPage();
        newsPage.findNews("искусство");
    }
}
