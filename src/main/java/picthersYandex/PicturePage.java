package picthersYandex;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PicturePage {
    public void findPicterPage() {
        $(By.xpath("//div[text()='Картинки']")).click();
    }

public void findPicter(String  searchPicter){
     $(By.xpath("//input[@name='text' and @type='text']"))
            .setValue( searchPicter);
     $(By.xpath("//button[@type='submit']/div[text()='Найти']"));
}}
