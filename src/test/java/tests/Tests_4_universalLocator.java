package tests;

import fixture.Fixture;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class Tests_4_universalLocator extends Fixture {
    @Test(description = "Универсальный локатор")
    public void UniversalLocatorTest(){
        wait.locExist(loc.divText, "Музыка");
        wait.locExist(loc.spanText, "Диск");
        click.loc(loc.divText, "Музыка");
        click.loc(loc.spanText, "Диск");
    }
}
