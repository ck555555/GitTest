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

@Epic("Яндекс")//например яндекс почта(модуль)
@Feature("Автоматизация сценариев")// например регистрация
@Story("Тестирвание картинок")//например регистрация через соц сети( юзерстори)
public class Tests_2_pictures extends Fixture {
    @Test(description = "Переход на вкладку картинок в Яндексе")
    public void happyPassPicter(){
        picturePage.findPicterPage();
        Selenide.switchTo().window("Яндекс.Картинки: поиск изображений в интернете, поиск по изображению");
        picturePage.findPicter("природа");
        $(By.xpath("//div[@class='page-layout__column page-layout__column_type_content']"))
                .shouldBe(Condition.exist);
    }
}
