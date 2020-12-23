package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import fixture.Fixture;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

@Epic("Яндекс")//папка 1го уровня
@Feature("Автоматизация сценариев")
@Story("Тестирвание поиска")
public class Tests_1_search extends Fixture {
    @Test(description = " Тест поиска Одноклассников")
    public void happyPassOK() {
        mainPage.goSearch("Одноклассники");
        $(By.xpath("//a[@href='https://ok.ru/groups']" +
                "//b[text()='Одноклассники']"))
                .shouldBe(Condition.visible);
    }

    @Test(description = "Тест калькулятора в поиске")
    public void happyPassCalc() {
        mainPage.goSearch("5+8");
        $(By.xpath("//div[@class='calculator__screen']" +
                "//span[text()='5 + 5']"))
                .shouldBe(Condition.exist);
        $(By.xpath("//div[@class='calculator__screen']" +
                "//span[text()='10']"))
                .shouldBe(Condition.exist);
    }

    @Test(description = "Проверка кнопки \"Ещё\"")
    public void happyPassMore() {
        $(By.xpath("//div[text()='ещё']")).click();
        $(By.xpath("//*[text()='Авиабилеты']")).waitUntil(Condition.exist, 10000);
        String realMore = $(By.xpath("//div[@class='services-new__more-popup-content']")).getText();
        System.out.println(realMore);

        String idealMore = "Авиабилеты\n" +
                "Афиша\n" +
                "Дзен\n" +
                "Директ\n" +
                "Диск\n" +
                "Едадил\n" +
                "Здоровье\n" +
                "Игры\n" +
                "КиноПоиск\n" +
                "Кью\n" +
                "Метрика\n" +
                "Недвижимость\n" +
                "Отели\n" +
                "Почта\n" +
                "Практикум\n" +
                "Путешествия\n" +
                "Работа\n" +
                "Радио\n" +
                "Расписания\n" +
                "Репетитор\n" +
                "Спорт\n" +
                "Таланты\n" +
                "Толока\n" +
                "Услуги\n" +
                "Школа\n" +
                "Эфир\n" +
                "Для мобильного\n" +
                "Программы\n" +
                "Все сервисы";

        Assert.assertEquals(realMore,idealMore);
    }
}
