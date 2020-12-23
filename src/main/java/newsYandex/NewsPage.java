package newsYandex;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewsPage {
    @Step("Открыть страницу новостей")
    public void openNewsPage(){
        $(By.xpath("//div[text()='Новости']")).click();
        Selenide.switchTo().window("Яндекс.Новости: Главные новости сегодня, самые свежие и последние новости России онлайн");
    }

    @Step("Найти новости по тексту {searchNews}")
    public void findNews (String searchNews){
        $(By.xpath("//input[@name='text' and @type='text']"))
                .setValue(searchNews);
        $(By.xpath("//button[@type='submit']/div[text()='Найти']")).click(); // Кнопка Найти
        $(By.xpath("//div[@class='page-content__left']"))
                .shouldBe(Condition.exist); // Проверка видимости страницы
    }
}
