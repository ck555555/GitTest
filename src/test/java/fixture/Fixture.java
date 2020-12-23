package fixture;

import actions.ClickWeb;
import actions.WaitWeb;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import locators.TestLoсator;
import newsYandex.NewsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import picthersYandex.PicturePage;
import steps.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class Fixture {
    public MainPage mainPage = new MainPage();
    public PicturePage picturePage = new PicturePage();
    public NewsPage newsPage = new NewsPage();
    public TestLoсator loc = new TestLoсator();
    public WaitWeb wait = new WaitWeb();
    public ClickWeb click = new ClickWeb();

    @BeforeMethod
    public void before() {
        SelenideLogger.addListener("allure",new AllureSelenide().screenshots(true).savePageSource(true));
        open("https://yandex.ru/");
    }


    @AfterMethod
    public void close() {
        Selenide.closeWebDriver();
    }
}
