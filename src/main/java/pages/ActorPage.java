package  pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ActorPage {

    public SelenideElement thirdActorName() {
        return $(By.xpath("//a[@data-testid='title-cast-item__actor'][3]"));
    }

    public SelenideElement actorName() {

        return $(By.xpath("//span[@data-testid='hero__primary-text']"));
    }

}