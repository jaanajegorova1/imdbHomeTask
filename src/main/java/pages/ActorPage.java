package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ActorPage {

    public SelenideElement actorName() {

        return $(By.xpath("//span[@data-testid='hero__primary-text']"));
    }

}